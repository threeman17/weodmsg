package msg.service;

import java.util.List;

import msg.pojo.Msg;

public interface ListMsgService {
	public List<Msg> selectMsgList();
	public Msg selectMsgByMid(int mid);
	public void uploadMsgById(Msg msg);
	public void insertMsg(Msg msg);
	public void deleteMsgById(int mid);
}
