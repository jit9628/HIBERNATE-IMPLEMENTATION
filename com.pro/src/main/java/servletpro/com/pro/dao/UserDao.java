package servletpro.com.pro.dao;

import servletpro.com.pro.entity.User;
import servletpro.com.pro.request.LoginRequest;


 public interface UserDao {
	public String registerUser(User user);
	public boolean loginUser(LoginRequest loginRequest);
}
