package servletpro.com.pro;

import org.jooq.DSLContext;

import servletpro.com.pro.dbconfig.JooqConfiguration;

public class JooqApp {

	public static void main(String[] args) {
	
		try {
			JooqConfiguration jooqConfiguration = new JooqConfiguration();
			DSLContext dslContext = jooqConfiguration.dslContext();
			System.out.println("DSL Context is >> "+dslContext);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void JooqConfiguration() {
		// TODO Auto-generated method stub
		
	}

}
