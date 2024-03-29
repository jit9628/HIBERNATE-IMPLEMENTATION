package servletpro.com.pro.hibernateconfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import servletpro.com.pro.dbconfig.ConnectionProvider;
import servletpro.com.pro.entity.Product;
import servletpro.com.pro.entity.User;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				// Create Configuration instance
				Configuration configuration = new Configuration();
				// Configure Hibernate properties
				configuration.setProperty("hibernate.dialect", ConnectionProvider.HIBERNATE_DIALECT);
				configuration.setProperty("hibernate.hbm2ddl.auto", ConnectionProvider.HIBERNATE_DDL);// for creating table
				configuration.setProperty("hibernate.connection.driver_class", ConnectionProvider.MYSQL_DRIVER);
				configuration.setProperty("hibernate.connection.url", ConnectionProvider.MYSQL_CONNECTION_URL);
				configuration.setProperty("hibernate.connection.username", ConnectionProvider.USERNAME);
				configuration.setProperty("hibernate.connection.password", ConnectionProvider.PASSWORD);
				configuration.setProperty("hibernate.connection.autocommit", ConnectionProvider.CONNECTION_AUTOCOMMIT);
				configuration.setProperty("show_sql", ConnectionProvider.SHOW_SQL);
				configuration.setProperty("format_sql", ConnectionProvider.FORMATE_SQL);
				//configuration.setProperty("use_sql_comments", "true");
				// Add mapped entities for xml
				// configuration.addResource("Person.hbm.xml");
				// configuration.addResource("Address.hbm.xml");
				// configuration.addClass(Product.class);
				configuration.addAnnotatedClass(Product.class);
				configuration.addAnnotatedClass(User.class);

				// Build the ServiceRegistry
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				// Build the SessionFactory
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

	
	public static Session getOpenSession(SessionFactory factory) {
		Session session=null;
		if(session==null)
			return factory.openSession();
		if(session.isOpen())
			return session;
		return factory.openSession();
		
		
	}
	
	
	public static void shutdown() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
