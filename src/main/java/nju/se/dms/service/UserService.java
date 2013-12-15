package nju.se.dms.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import nju.se.dms.dao.UserDAO;
import nju.se.dms.model.User;
import nju.se.dms.model.PageParam;

@Path("user")
public class UserService extends BaseService{

    @Autowired
    private UserDAO userDAO;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/query_by_id")
    public String getItem(@QueryParam("id")int user_id) {
    	if(user_id==0)
    		return status2();
    	try {
			return status0("user", userDAO.findById(user_id));
		} catch (Exception e) {
			//log.error(e.getMessage());
			return status1();
		}
    }
   
}
