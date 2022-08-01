//49
public class func{
	public void assertShutdownOK(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName) +
        DriverManager.getConnection(url, user, password);
}
}
