public class func{
public void getConnection(){
      prop.setProperty("user", JDBCProfileStore.databaseUser(dbName));
      prop.setProperty("password", JDBCProfileStore.databasePassword(dbName));
      Class driverClass = Class.forName(JDBCProfileStore.driver(dbName, 0));
      DriverManager.registerDriver((java.sql.Driver) driverClass.newInstance());
      Connection conn = DriverManager.getConnection(JDBCProfileStore.databaseURL(dbName), prop);
}
}
