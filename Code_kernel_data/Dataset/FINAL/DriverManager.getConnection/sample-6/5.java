public class func{
public void getConnection(){
      Connection conn = DriverManager.getConnection(url);
      conn.setAutoCommit(false);
}
}
