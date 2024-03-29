package servletpro.com.pro.dao;
import servletpro.com.pro.entity.Product;
public interface ProductDao {
	public int addProduct(Product product);
	public java.util.List<Product> getAllProduct();

}
