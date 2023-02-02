//48
public class func{
	public void assertShutdownWOUPOK(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url, null);
}
}
