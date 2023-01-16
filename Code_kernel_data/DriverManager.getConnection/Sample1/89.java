//88
public class func{
	public void getConnection(String jdbcURL,String user,String pwd){
    Connection conn = DriverManager.getConnection(jdbcURL, user, pwd);
    conn.createStatement().execute("set hive.support.concurrency = false");
}
}
