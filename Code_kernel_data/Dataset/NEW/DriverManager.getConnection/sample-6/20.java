//20
public class func{
public void newConnection(){
    Connection connection = DriverManager.getConnection(jdbcUrl);
    connection.setAutoCommit(false);
}
}
