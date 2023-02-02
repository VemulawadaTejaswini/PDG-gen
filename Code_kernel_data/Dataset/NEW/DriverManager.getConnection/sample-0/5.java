//5
public class func{
public void testClearOtherConnection(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.saveSpecialConnection(conn1);
      pooled.clearSpecialConnection(conn2);
      pooled.close();
}
}
