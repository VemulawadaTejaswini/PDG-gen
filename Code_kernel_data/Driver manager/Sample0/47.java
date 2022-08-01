//46
public class func{
	public void assertShutdownFail(String expectedSqlState,String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName) +
            DriverManager.getConnection(url, user, password);
}
}
