//173
public class func{
	public void testNestedConnection(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.saveSpecialConnection(conn1);
      pooled.releaseConnection(conn1);
      pooled.close();
}
}
