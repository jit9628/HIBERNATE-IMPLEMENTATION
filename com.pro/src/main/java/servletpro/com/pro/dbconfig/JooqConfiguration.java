package servletpro.com.pro.dbconfig;
import java.sql.SQLException;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
public class JooqConfiguration {
	public DSLContext dslContext() throws SQLException {
		return DSL.using(DbConnection.getConnection(),SQLDialect.MYSQL);
	}
}
