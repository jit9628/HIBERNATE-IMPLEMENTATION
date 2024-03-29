package servletpro.com.pro.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;

import servletpro.com.pro.dao.UserDao;
import servletpro.com.pro.dbconfig.DbConnection;
import servletpro.com.pro.entity.User;
import servletpro.com.pro.hibernateconfig.HibernateUtil;
import servletpro.com.pro.request.LoginRequest;

public class UserDaoImpl  implements UserDao{
	private Connection connection=null;
	private Session session=null;

	{
		connection=DbConnection.getConnection();
		session=HibernateUtil.getSessionFactory().openSession();
	}
	@Override
	public String registerUser(User user) {
		String msg=null;
		try {
			//int id=1;
			//String sql="insert into register_users(username,email,mobile,adr,securitycode)value('"+user.getUsername()+"','"+user.getEmail()+"','"+user.getMobilenumber()+"','"+user.getArea()+"','"+user.getPassword()+"')";
		//	PreparedStatement pstmt = this.connection.prepareStatement("insert into register_users(username,email,mobile,adr,securitycode)value(?,?,?,?,?");
			
			//pstmt.setInt(1, id);
//			pstmt.setString(1, user.getUsername());
//			pstmt.setString(2, user.getEmail());
//			pstmt.setString(3, user.getMobilenumber());
//			pstmt.setString(4, user.getArea());
//			pstmt.setString(5, user.getPassword());
			
			
			//boolean execute = pstmt.execute();
			
			//this.connection.createStatement("insert into register_users(username,email,mobile,adr,securitycode)");
			//Statement statement = this.connection.createStatement();
			//boolean execute = statement.execute(sql);
			//System.out.println("operation value is : "+execute);
			//if(!execute) {
			//	msg="SUCCESS";
			//	return msg;
		//	}else {
		//		msg="FAILLED";
		//		return msg;
		//}
			
			
			this.session.save(user);
			this.session.beginTransaction().commit();
			
			
		} catch (Exception e) {
			msg=e.getLocalizedMessage();
			return msg;
		}
		return msg;
	
		//return msg;
	}

	@Override
	public boolean loginUser(LoginRequest loginRequest) {
		
		try {
			Statement statement = this.connection.createStatement();
			
			ResultSet executeQuery = statement.executeQuery("select * from register_users where email='"+loginRequest.getEmail()+"' and securitycode='"+loginRequest.getPassword()+"' " );
			boolean next = executeQuery.next();
			
			
			int row = executeQuery.getRow();
			System.out.println("ROW <> "+row);
			System.out.println("next <> "+next);
			if(row==1) {
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
		
		
		
		
		
	}

}
