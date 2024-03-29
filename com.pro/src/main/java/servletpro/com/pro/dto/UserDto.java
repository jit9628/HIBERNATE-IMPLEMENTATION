package servletpro.com.pro.dto;

import java.util.Scanner;

import servletpro.com.pro.daoimpl.ProductDaoImpl;
import servletpro.com.pro.daoimpl.UserDaoImpl;
import servletpro.com.pro.entity.Product;
import servletpro.com.pro.entity.User;
import servletpro.com.pro.request.LoginRequest;

public class UserDto {

	UserDaoImpl daoImpl = null;
	ProductDaoImpl productDaoImpl = null;
	{
		daoImpl = new UserDaoImpl();
		productDaoImpl = new ProductDaoImpl();
	}
	public String register() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String username = sc.nextLine();
		System.out.println("Enter Your Email");
		String email = sc.nextLine();
		System.out.println("Enter Your Mobienumber");
		String mobilenumber = sc.nextLine();
		System.out.println("Enter Your Area");
		String area = sc.nextLine();
		System.out.println("Enter Your Password");
		String password = sc.nextLine();
		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setMobilenumber(mobilenumber);
		user.setArea(area);
		user.setPassword(password);
		// call dao class inside class all database pecific operation

		String registerUser = daoImpl.registerUser(user);
		return registerUser;

	}

	public boolean userLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email");
		String email = sc.nextLine();
		System.out.println("Enter Your Password");
		String password = sc.nextLine();
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setEmail(email);
		loginRequest.setPassword(password);
		boolean loginUser = daoImpl.loginUser(loginRequest);
		return loginUser;
	}

	public Integer addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Product Name");
		String username = sc.nextLine();

		Product product = new Product();
		product.setProductname(username);
		int product2 = productDaoImpl.addProduct(product);

		return product2;
	}

	// ========================================================
//	get Product

	public void productList() {
//		Session openSession = HibernateUtil.getSessionFactory().openSession();
//		Query<Product> query = openSession.createQuery("from Product", Product.class);
//		
//		List<Product> collect = query.getResultList().stream().map(o->{
//			Product p=new Product();
//			p.setId(o.getId());
//			p.setProductname(o.getProductname());
//			return p;	
//		}).collect(Collectors.toList());
//		for (Product product : collect) {
//			System.out.println(product.getId());
//			System.out.println(product.getProductname());
//		}
//		
	}

}
