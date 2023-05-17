public class func{
public void test(){
    Statement stmt = conn.createStatement();
    stmt.execute(sql);
    ResultSet rs = stmt.getResultSet();
    if (rs != null) {
      while (rs.next()) {
        rs.getObject(1);
      }
      rs.close();
    }
    stmt.close();
}
}
