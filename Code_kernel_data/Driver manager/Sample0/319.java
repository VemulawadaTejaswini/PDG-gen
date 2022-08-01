//318
public class func{
	public void getJdbcConnection(){
    return DriverManager.getConnection(getProperty(TAJO_JDBC_URI));
}
}
