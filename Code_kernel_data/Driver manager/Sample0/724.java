//723
public class func{
	public void getConnection(String driver,String jdbcURL,String user,String pass){
    return DriverManager.getConnection(jdbcURL, user, pass);
}
}
