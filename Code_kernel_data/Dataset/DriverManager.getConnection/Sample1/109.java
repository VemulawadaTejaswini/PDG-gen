//108
public class func{
	public void setup(){
      Connection con = DriverManager.getConnection(StatefulUniqueCountTest.INMEM_DB_URL, new Properties());
      Statement stmt = con.createStatement();
      stmt.execute("CREATE TABLE IF NOT EXISTS " + StatefulUniqueCountTest.TABLE_NAME + " (col1 INTEGER, col2 INTEGER, col3 BIGINT)");
}
}
