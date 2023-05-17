public class func{
public void insert(String sql){
      conn = DriverManager.getConnection(url);
      stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      stmt.close();
}
}
