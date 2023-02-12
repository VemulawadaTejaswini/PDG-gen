public class func{
public void createConnection(){
    Connection connection = DriverManager.getConnection(miniHS2.getJdbcURL(dbName),
      System.getProperty("user.name"), "bar");
    Statement statement = connection.createStatement();
    localConnection.set(connection);
    localStatement.set(statement);
    statement.execute("USE " + dbName);
}
}
