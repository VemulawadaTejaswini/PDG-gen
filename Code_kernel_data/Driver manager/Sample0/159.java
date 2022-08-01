//158
public class func{
	public void createConnection(){
    Connection jdbcConnection = DriverManager.getConnection(
        PropertiesUtil.JDBC_URL, PropertiesUtil.JDBC_USERNAME,
        PropertiesUtil.JDBC_PASSWD);
    return new DatabaseConnection(jdbcConnection);
}
}
