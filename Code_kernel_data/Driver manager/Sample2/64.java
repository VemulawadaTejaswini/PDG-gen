//63
public class func{
	public void getDateAsString(){
    Connection conn = DriverManager
        .getConnection("jdbc:default:connection");
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT CURRENT_DATE");
      if (rs.next())
        return rs.getDate(1).toString();
      if (rs != null)
        rs.close();
      if (stmt != null)
        stmt.close();
      conn.close();
}
}
