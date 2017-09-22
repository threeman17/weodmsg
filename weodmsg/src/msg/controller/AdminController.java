package msg.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import msg.pojo.Msg;
import msg.service.ListMsgService;

@Controller
public class AdminController {

	@Autowired
	ListMsgService listMsgService;
	
	@RequestMapping("/admin/msglist.action")
	public Object getMsgList(HttpSession httpSession) {
		List<Msg> list = listMsgService.selectMsgList();
		httpSession.setAttribute("msglist", list);
	
		return "admin/feedback-list";
	}
	
	@RequestMapping("/admin/msgedit.action")
	public Object MsgEdit(HttpSession httpSession,int mid) {
		Msg msg = listMsgService.selectMsgByMid(mid);
		httpSession.setAttribute("msg", msg);
		return "admin/msg-edit";
	}
	
	@RequestMapping("/admin/msgadd.action")
	public Object MsgAdd(HttpSession httpSession) {
		return "admin/msg-add";
	}
	
	
}
