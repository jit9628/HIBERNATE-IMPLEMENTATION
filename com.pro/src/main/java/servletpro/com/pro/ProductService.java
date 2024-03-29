package servletpro.com.pro;

import java.util.Scanner;

import servletpro.com.pro.components.AppComponent;
import servletpro.com.pro.dao.ProductRepoImpl;
import servletpro.com.pro.dto.ProductDto;
import servletpro.com.pro.entity.Product;

public class ProductService {
	
	
	private ProductRepoImpl productRepoImpl;
	{
		productRepoImpl=new ProductRepoImpl(new AppComponent());
	}
	
	
	public Integer addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Product Name");
		String username = sc.nextLine();
		ProductDto productDto = new ProductDto();
		productDto.setProductname(username);
		String data = productRepoImpl.addData(productDto);
		
		return 1;

		
	}

}
