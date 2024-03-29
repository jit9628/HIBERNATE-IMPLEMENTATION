package servletpro.com.pro.daoimpl;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.query.Query;

import servletpro.com.pro.dao.ProductDao;
import servletpro.com.pro.entity.Product;
import servletpro.com.pro.hibernateconfig.HibernateUtil;

public class ProductDaoImpl implements ProductDao {
	
	
	

	@Override
	public int addProduct(Product product) {
		Session openSession = HibernateUtil.getSessionFactory().openSession();
		Serializable save = openSession.save(product);
		openSession.beginTransaction().commit();
		
		return (Integer)save;
	}
	

	@Override
	public List<Product> getAllProduct() {
		Session openSession = HibernateUtil.getSessionFactory().openSession();
		Query<Product> query = openSession.createQuery("from Product", Product.class);
		
		List<Product> collect = query.getResultList().stream().map(o->{
			Product p=new Product();
			p.setId(o.getId());
			p.setProductname(o.getProductname());
			return p;	
		}).collect(Collectors.toList());
		for (Product product : collect) {
			System.out.println(product.getId());
			System.out.println(product.getProductname());
		}
		
		return collect;
	}

}
