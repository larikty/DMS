package nju.se.dms.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import nju.se.dms.dao.BaseDAO;
import nju.se.dms.model.BaseModel;
import nju.se.dms.model.PageParam;

public class UserDAO  extends BaseDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public BaseModel findById(int id) throws Exception{
		BaseModel result=(BaseModel) sqlSession.selectOne("UserMapper.findItem",id);
		return result;
	}
	
	public BaseModel findByEmail(String user_email) throws Exception{
		BaseModel result=(BaseModel) sqlSession.selectOne("UserMapper.findItemByEmail",user_email);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BaseModel> findList(PageParam pageParam) throws Exception{
		List<BaseModel> result = sqlSession.selectList("UserMapper.findList",pageParam);
		return result;
	}

	@Override
	public int insert(BaseModel user) throws Exception{
		sqlSession.insert("UserMapper.insert",user);
		return user.getId();
	}

	@Override
	public boolean update(BaseModel user) throws Exception{
		sqlSession.update("UserMapper.update", user);
		return true;
	}

	@Override
	public boolean delete(BaseModel user) throws Exception{
		sqlSession.update("UserMapper.delete", user);
		return true;
	}
	
	@Override
	public int countList(PageParam pageParam)throws Exception{
		int result=(Integer)sqlSession.selectOne("UserMapper.countList",pageParam);
		return result;
	}

	@Override
	public int countItem() throws Exception{
		int result=(Integer)sqlSession.selectOne("UserMapper.countItem");
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BaseModel> updateTable(long update_time)throws Exception{
		List<BaseModel> result = sqlSession.selectList("UserMapper.updateTable",update_time);
		return result;
	}
	
	public boolean updatePassword(BaseModel user) throws Exception{
		sqlSession.update("UserMapper.updatePassword", user);
		return true;
	}

	public int login(String email,String pwd){
		Map map = new HashMap<String,String>();
		map.put("user_email", email);
		map.put("user_password", pwd);
		int rowId=-1;
		try{
		if((Integer) sqlSession.selectOne("UserMapper.login",map)==null){
			rowId=-1;
		}else{
			rowId=(Integer) sqlSession.selectOne("UserMapper.login",map);
		}
		}catch(Exception e){
			rowId =-1;
			e.printStackTrace();
		}
		return rowId;
	}
}
