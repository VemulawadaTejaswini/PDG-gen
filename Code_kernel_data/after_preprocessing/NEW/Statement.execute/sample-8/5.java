//5
public class func{
public void test(){
    Statement stmt = conn.createStatement();
    stmt.execute(sql);
    ResultSet rs = stmt.getResultSet();
    if (rs != null) {
      // read the first column from each row in the result set
      while (rs.next()) {
        rs.getObject(1);
      }
      rs.close();
    }
    stmt.close();
}
}
