//314
public class func{
	public void getConnection(String dbName){
      return DriverManager.getConnection(DBCP_DRIVER + dbName);
}
}
