//174
public class func{
public void testReleaseUnknown(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.releaseConnection(conn1);
      pooled.close();
}
}
