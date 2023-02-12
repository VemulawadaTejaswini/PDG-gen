public class func{
public void createDb(){
    Connection conn = DriverManager.
      getConnection(miniHS2.getJdbcURL(), System.getProperty("user.name"), "bar");
    Statement stmt2 = conn.createStatement();
    stmt2.execute("CREATE DATABASE " + dbName);
    stmt2.close();
}
}
