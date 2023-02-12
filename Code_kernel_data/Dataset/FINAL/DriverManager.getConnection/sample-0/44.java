public class func{
public void assertConnectionWOUPOK(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
        DriverManager.getConnection(url2).close();
}
}
