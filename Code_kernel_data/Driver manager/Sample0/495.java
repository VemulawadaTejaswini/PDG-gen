//494
public class func{
	public void checkTableExists(String url,String user,String password,String table){
      conn = DriverManager.getConnection(url, user, password);
      return checkTableExists(conn, table);
      DBUtil.closeConnection(log, conn);
}
}
