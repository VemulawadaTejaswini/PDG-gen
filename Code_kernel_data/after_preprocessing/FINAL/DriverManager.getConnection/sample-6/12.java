public class func{
public void getConnection(){
    Connection connection = DriverManager.getConnection(DB_URL);
    connection.setAutoCommit(false);
}
}
