//6
public class func{
public void testSaveOtherConnection(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.saveSpecialConnection(conn2);
      pooled.close();
}
}
