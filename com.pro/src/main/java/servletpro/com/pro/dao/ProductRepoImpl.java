package servletpro.com.pro.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import servletpro.com.pro.components.AppComponent;
import servletpro.com.pro.dto.ProductDto;
import servletpro.com.pro.entity.Product;
@Repository
public class ProductRepoImpl implements ProductRepo {
	@Autowired
	private AppComponent appComponent;
	public ProductRepoImpl(AppComponent appComponent) {
		this.appComponent=appComponent;
	}
	@Override
	public String addData(ProductDto product) {
		
		try {
			Product product2 = new Product();
			product2.setProductname(product.getProductname());
			
			Connection connection = appComponent.getStatement(new DriverManagerDataSource());
			Statement statement = connection.createStatement();
			boolean execute = statement.execute("insert into product(productname)values('"+product2.getProductname()+"')");
			System.out.println("execution value is :: "+execute);
			System.out.println("Repository DataSource >> "+connection);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
