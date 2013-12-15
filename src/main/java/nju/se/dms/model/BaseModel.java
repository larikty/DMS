package nju.se.dms.model;

public class BaseModel {

	public long create_time;
	public long update_time;
	public int flag;
	/**
	 * @return the create_time
	 */
	public long getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}
	/**
	 * @return the update_time
	 */
	public long getUpdate_time() {
		return update_time;
	}
	/**
	 * @param update_time the update_time to set
	 */
	public void setUpdate_time(long update_time) {
		this.update_time = update_time;
	}
	/**
	 * @return the flag
	 */
	public int getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getId(){
		return 0;
	}
}
