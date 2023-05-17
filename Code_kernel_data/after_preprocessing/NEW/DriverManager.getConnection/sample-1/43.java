//43
public class func{
public void testAddTTLToExistingColumnFamily(){
      Connection conn = DriverManager.getConnection(getUrl(), props);
      conn.setAutoCommit(false);
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
