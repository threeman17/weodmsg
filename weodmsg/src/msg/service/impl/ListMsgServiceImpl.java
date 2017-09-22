package msg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import msg.mapper.ListMsgMapper;
import msg.pojo.Msg;
import msg.service.ListMsgService;

@Service
public class ListMsgServiceImpl implements ListMsgService {

	@Autowired
	ListMsgMapper listMsgMapper;
	
	@Override
	public List<Msg> selectMsgList() {
		List<Msg> list = listMsgMapper.selectMsgList();
		return list;
	}

	@Override
	public Msg selectMsgByMid(int mid) {
		Msg msg = listMsgMapper.selectMsgByMid(mid);
		return msg;
	}

	@Override
	public void uploadMsgById(Msg msg) {
		listMsgMapper.uploadMsgById(msg);
		
	}

	@Override
	public void insertMsg(Msg msg) {
		listMsgMapper.insertMsg(msg);
		
	}

	@Override
	public void deleteMsgById(int mid) {
		listMsgMapper.deleteMsgById(mid);
		
	}

	

}
