package servletpro.com.pro.dbconfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import servletpro.com.pro.entity.User;
@Configuration
@Configurable
public class AppConfig {
	@Bean
	public DriverManagerDataSource dataSource() {
		
		return new DriverManagerDataSource();
	}
	
	@Bean
	public User user() {
		return new User();
	}

}
