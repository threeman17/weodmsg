package msg.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import msg.pojo.Msg;
import msg.service.ListMsgService;

@Controller
public class BasicController {

	@Autowired
	ListMsgService listMsgService;
	
	@RequestMapping("/msglist.action")
	@ResponseBody
	public Object getMsgList(String callback) {
		List<Msg> list = listMsgService.selectMsgList();
		MappingJacksonValue mjv=new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
	
	@RequestMapping("/msgupload.action")
	public Object MsgUpload(Msg msg) {
		msg.setUpload_time(new Date());
		listMsgService.uploadMsgById(msg);
		return "redirect:/admin/msglist.action";
	}
	/**
	 * 新增消息
	 * @author cewin
	 * @email cewin95@foxmaill.com
	 * @version 1.0
	 * @date 2017年9月22日	下午12:14:07
	 * @param msg
	 * @return
	 */
	@RequestMapping("/msgInsert.action")
	public Object MsgInsert(Msg msg) {
		msg.setUpload_time(new Date());
		msg.setCreate_time(new Date());
		listMsgService.insertMsg(msg);
		return "redirect:/admin/msglist.action";
	}
	@RequestMapping("/msgDelete.action")
	@ResponseBody
	public Object MsgDelete(int mid) {
		listMsgService.deleteMsgById(mid);
		return new ArrayList<>();
	}
	
}
