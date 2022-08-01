//157
public class func{
	public void getConnection(String url,String user,String password){
        Connection jdbcConnection = DriverManager.getConnection(url, user, password);
        return new DatabaseConnection(jdbcConnection);
}
}
