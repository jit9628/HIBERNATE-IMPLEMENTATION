package servletpro.com.pro.dbconfig;

public interface ConnectionProvider {
	public static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String MYSQL_CONNECTION_URL = "jdbc:mysql://localhost:3306/servletproject";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	public static final String HIBERNATE_DIALECT = "org.hibernate.dialect.MySQL5Dialect";
	public static final String SHOW_SQL = "true";
	public static final String CONNECTION_AUTOCOMMIT = "true";
	public static final String FORMATE_SQL = "true";
	public static final String HIBERNATE_DDL = "update";

	// Hibernate Property
	// all property sql server
//	public static final String MYSQL_DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	public static final String MYSQL_CONNECTION_URL="jdbc:sqlserver://192.168.2.161:1433;databaseName=db_POSOCO1;encrypt=true;trustServerCertificate=true";
//	public static final String USERNAME="sa";
//	public static final String PASSWORD="Precise@123";
//	public static final String HIBERNATE_DIALECT="org.hibernate.dialect.SQLServerDialect";
//	public static final String SHOW_SQL="true";
//	public static final String CONNECTION_AUTOCOMMIT="true";
//	public static final String FORMATE_SQL="true";
//	public static final String HIBERNATE_DDL="update";

}
