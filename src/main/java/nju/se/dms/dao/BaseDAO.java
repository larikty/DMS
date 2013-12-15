package nju.se.dms.dao;

import java.util.List;

import nju.se.dms.model.BaseModel;
import nju.se.dms.model.PageParam;

public class BaseDAO {

	public BaseModel findById(int id) throws Exception {return null;}
	public List<BaseModel> findList(PageParam pageParam)throws Exception{return null;}
	public int insert(BaseModel baseModel)throws Exception{return 0;}
	public boolean update(BaseModel baseModel)throws Exception{return false;}
	public boolean delete(BaseModel baseModel)throws Exception{return false;}
	public int countList(PageParam pageParam)throws Exception{return 0;}
	public int countItem()throws Exception{return 0;}
	public List<BaseModel> updateTable(long update_time)throws Exception{return null;}
}
