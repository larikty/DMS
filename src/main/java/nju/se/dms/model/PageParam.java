package nju.se.dms.model;

public class PageParam {

	private int page_num;
	private int page_size;
	private String keyword;
	/**
	 * @return the page_number
	 */
	public int getPage_num() {
		return page_num;
	}
	/**
	 * @param page_number the page_number to set
	 */
	public void setPage_num(int page_num) {
		this.page_num = page_num;
	}
	/**
	 * @return the page_size
	 */
	public int getPage_size() {
		return page_size;
	}
	/**
	 * @param page_size the page_size to set
	 */
	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}
	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
