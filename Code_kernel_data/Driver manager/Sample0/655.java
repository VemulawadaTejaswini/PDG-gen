//654
public class func{
	public void setUp(){
        final String jdbcUrl = constructJdbcUrl();
        logger.debug("Using JDBC URL: " + jdbcUrl);
        DriverManager.getConnection(jdbcUrl);
}
}
