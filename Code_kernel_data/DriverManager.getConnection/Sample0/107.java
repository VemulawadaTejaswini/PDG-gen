//106
public class func{
	public void JDBCAdapter(String url,String driverName,String user,String passwd){
            connection = DriverManager.getConnection(url, user, passwd);
            statement = connection.createStatement();
}
}
