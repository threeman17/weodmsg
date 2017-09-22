package msg.mapper;

import java.util.List;

import msg.pojo.Msg;



public interface ListMsgMapper {
	public List<Msg> selectMsgList();
	public Msg selectMsgByMid(int mid);
	public void uploadMsgById(Msg msg);
	public void insertMsg(Msg msg);
	public void deleteMsgById(int mid);
	
}
