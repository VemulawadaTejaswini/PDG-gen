//11
public class func{
public void createUser(String username,String password,String email){
      conn = DriverManager.getConnection("jdbc:default:connection");
      stmt = conn.prepareStatement(sql);
      stmt.setString(3, email);
      stmt.executeUpdate();
      JdbcUtils.closeStatement(stmt);
      JdbcUtils.closeConnection(conn);
}
}
