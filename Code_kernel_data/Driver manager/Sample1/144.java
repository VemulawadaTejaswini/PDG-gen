//143
public class func{
	public void teardown(){
      Connection con = DriverManager.getConnection(CASSANDRA_DB_URL);
      Statement stmt = con.createStatement();
      stmt.executeUpdate(dropKeyspace);
}
}
