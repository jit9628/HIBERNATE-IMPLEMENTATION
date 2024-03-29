package servletpro.com.pro.dbconfig;
import java.sql.Connection;
import java.sql.DriverManager;


// this class responsible for handle jdbc connection and cretion only one instance [Singleton Instance ...]

public final class DbConnection {

	private DbConnection() {}

	private static Connection connection=null;
	public static synchronized Connection getConnection() {
		
		
		try {
			Class.forName(ConnectionProvider.MYSQL_DRIVER);
			if(connection==null) {
				
				connection=DriverManager.getConnection(ConnectionProvider.MYSQL_CONNECTION_URL, ConnectionProvider.USERNAME, ConnectionProvider.PASSWORD);
				
				return connection;
			}else {
				return connection;
			}	
		} catch (Exception e) {
			System.out.println("Getting Error Are : "+e.getLocalizedMessage());
		}
		return connection;
		
	}
}
