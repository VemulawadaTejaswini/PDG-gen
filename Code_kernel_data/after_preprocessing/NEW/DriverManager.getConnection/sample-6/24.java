//24
public class func{
public void createConnection(String driverClassName,String url){
    Connection connection = DriverManager.getConnection(url);
    connection.setAutoCommit(false);
}
}
