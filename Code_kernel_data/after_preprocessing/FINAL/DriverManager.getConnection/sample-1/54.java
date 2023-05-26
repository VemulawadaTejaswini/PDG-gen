public class func{
public void testRetrieve(){
      Connection conn = DriverManager.getConnection(getUrl());
      conn.createStatement().execute(ddl);
}
}
