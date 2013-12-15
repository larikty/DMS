package nju.se.dms.model;

import com.google.gson.annotations.Expose;

public class User extends BaseModel {
	@Expose
	private int user_id;
	@Expose
	private String user_name;
	@Expose
	private String user_password;
	@Expose
	private String user_position;
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	/**
	 * @return the user_position
	 */
	public String getUser_position() {
		return user_position;
	}
	/**
	 * @param user_position the user_position to set
	 */
	public void setUser_position(String user_position) {
		this.user_position = user_position;
	}
	
}
