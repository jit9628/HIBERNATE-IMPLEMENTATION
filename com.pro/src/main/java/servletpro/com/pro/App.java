package servletpro.com.pro;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import servletpro.com.pro.dao.Test;
import servletpro.com.pro.dash.Dash;
import servletpro.com.pro.dto.UserDto;
import servletpro.com.pro.hibernateconfig.HibernateUtil;
public class App {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session openSession = sessionFactory.openSession();
			System.out.println(""+openSession);
			System.out.println("Session Factory is >> " + sessionFactory);
			ProductService productService = new ProductService();
			Integer product3 = productService.addProduct();
			Session openSession2 = HibernateUtil.getOpenSession(sessionFactory);
			// AppComponent appComponent = new AppComponent();
			// AppComponent appComponent = new AppComponent(new DriverManagerDataSource());
			// Connection statement = appComponent.getStatement(new
			// DriverManagerDataSource());
			// System.out.println("Connection Statement <><><><> " + statement);
			// appComponent.pourCoffee();
			// get bean from application context [Container .. ]
			// AnnotationConfigApplicationContext ctx = new
			// AnnotationConfigApplicationContext(AppConfig.class);
			// User bean = ctx.getBean("user", User.class);
			// System.out.println("User Bean Is >> "+bean);
			// DriverManagerDataSource bean2 = ctx.getBean("dataSource",
			// DriverManagerDataSource.class);
			// System.out.println("Driver Manager DataSource Is >> "+bean2.getConnection());

			Test test = new Test();
			System.out.println(test);
			System.out.println("==============================================");
			System.out.println("WELCOME TO THE ACCESS HUB OUTDOOR .....");
			System.out.println("==============================================");
			Scanner sc = new Scanner(System.in);
			int value;
			int key = 0;
			System.out.println("Press 1 For Registration..");
			System.out.println("Press 2 For LogIn..");
			System.out.println("Press 3 For Add Product..");
			System.out.println("Press 4 For List Of Product..");
			value = sc.nextInt();
			switch (value) {

			case 1:
				UserDto userDto = new UserDto();
				String register = userDto.register();
				System.out.println("Operation Result is :: " + register);
				break;
			case 2:
				UserDto userDto1 = new UserDto();
				boolean userLogin = userDto1.userLogin();
				Dash.setLogged(userLogin);
				Dash dash = new Dash();
				dash.AccessData();

				break;
			case 3:
				UserDto dto = new UserDto();
				Integer product2 = dto.addProduct();
				System.out.println("Serializable Id is " + product2);
				break;
			case 4:

				UserDto dt = new UserDto();
				dt.productList();
				break;
			default:
				UserDto d = new UserDto();
				Integer product = d.addProduct();
				System.out.println("product id is >>>> " + product);

			}

		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
