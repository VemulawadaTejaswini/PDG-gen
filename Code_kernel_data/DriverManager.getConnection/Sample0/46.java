//45
public class func{
	public void assertConnectionFail(String dbName){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url);
}
}
