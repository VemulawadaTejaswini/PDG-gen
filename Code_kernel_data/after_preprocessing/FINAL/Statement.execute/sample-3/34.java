public class func{
public void test_merge(){
      Connection conn = dataSource.getConnection();
      Statement stmt = conn.createStatement();
      stmt.execute(sql);
      stmt.close();
}
}
