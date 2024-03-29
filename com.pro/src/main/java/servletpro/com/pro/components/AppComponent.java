package servletpro.com.pro.components;
import java.sql.Connection;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
@Component
public class AppComponent {
	private DriverManagerDataSource ds;
	public AppComponent() {
	}
	// constructor injection
//	@Autowired
//	public AppComponent(DriverManagerDataSource driverManagerDataSource) {
//		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		driverManagerDataSource.setPassword("root");
//		driverManagerDataSource.setUsername("root");
//		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/servletproject");
//		this.ds = driverManagerDataSource;
//
//	}

	
	@Autowired
	public Connection getStatement(DriverManagerDataSource driverManagerDataSource) throws SQLException {
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setPassword("root");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/servletproject");
		return driverManagerDataSource.getConnection();

	}

}