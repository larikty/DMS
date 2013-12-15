package nju.se.dms.service;



import java.util.List;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;

import net.sf.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nju.se.dms.model.BaseModel;

public class BaseService {
	Gson gsonNew = new Gson();
	Gson gsonBuild = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	
	Logger log = Logger.getRootLogger();
	
	protected String status0() {
		JSONObject result = new JSONObject();
    	result.put("status", 0);
		return result.toString();
	}
	
	protected String status0(String idName,int id) {
		JSONObject result = new JSONObject();
    	result.put("status", 0);
    	result.put(idName, id);
		return result.toString();
	}
	protected String status10(String idName,int id) {
		JSONObject result = new JSONObject();
    	result.put("status", 10);
    	result.put(idName, id);
		return result.toString();
	}

	protected String status0(String key,String value) {
		JSONObject result = new JSONObject();
    	result.put("status", 0);
    	result.put(key, value);
		return result.toString();
	}
	
	protected String status0(String modelName,BaseModel baseModel) {
		JSONObject result = new JSONObject();
    	result.put("status", 0);
    	result.put(modelName, gsonBuild.toJson(baseModel));
		return result.toString();
	}
	
	protected String status0(String listName,List<BaseModel> list) {
		JSONObject result = new JSONObject();
    	result.put("status", 0);
    	result.put(listName, gsonBuild.toJson(list));
		return result.toString();
	}
	
	protected String status0(int pageSum, String listName,List<BaseModel> list) {
		JSONObject result = new JSONObject();
    	result.put("status", 0);
    	result.put("page_sum", pageSum);
    	result.put(listName, gsonBuild.toJson(list));
		return result.toString();
	}
	
	protected String status1() {
		JSONObject result = new JSONObject();
    	result.put("status", 1);
		return result.toString();
	}
	
	protected String status2() {
		JSONObject result = new JSONObject();
    	result.put("status", 2);
		return result.toString();
	}
	
	protected String status3() {
		JSONObject result = new JSONObject();
    	result.put("status", 3);
		return result.toString();
	}
	
	protected String status4() {
		JSONObject result = new JSONObject();
    	result.put("status", 4);
		return result.toString();
	}
	
	protected String status5() {
		JSONObject result = new JSONObject();
    	result.put("status", 5);
		return result.toString();
	}
	
	protected String  status8() {
		JSONObject result = new JSONObject();
    	result.put("status", 8);
		return result.toString();
	}
	
	protected String  status9() {
		JSONObject result = new JSONObject();
    	result.put("status", 9);
		return result.toString();
	}
}
