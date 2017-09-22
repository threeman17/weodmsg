package msg.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Msg {

	private int mid;
	private String title;
	private String content;
	private Date create_time;
	private Date upload_time;
	public int getMid() {
		return mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	
	public String getCreateTimeFormat() {
		return format(create_time);
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getUploadTimeFormat() {
		return format(upload_time);
	}
	public void setUpload_time(Date update_time) {
		this.upload_time = update_time;
	}
	
	
	public Date getCreate_time() {
		return create_time;
	}
	public Date getUpload_time() {
		return upload_time;
	}
	public String format(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
		return sdf.format(date);
	}
	@Override
	public String toString() {
		return "Msg [mid=" + mid + ", title=" + title + ", content=" + content + ", create_time=" + create_time
				+ ", upload_time=" + upload_time + "]";
	}
	
	
	
}
