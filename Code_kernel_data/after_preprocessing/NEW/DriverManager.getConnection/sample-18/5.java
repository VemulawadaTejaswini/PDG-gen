//5
public class func{
public void connect(){
    if (context == null || context.isClosed()) {
      context = DriverManager.getConnection(dsn, username, password);
    }
    if (context == null || context.isClosed()) {
      throw new SQLException("Lost context to MYSQL server!");
    }
}
}
