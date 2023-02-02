//13
public class func{
public void executeSQL(String sql){
      Statement stmt = conn.createStatement();
      stmt.execute(sql);
      stmt.close();
}
}
