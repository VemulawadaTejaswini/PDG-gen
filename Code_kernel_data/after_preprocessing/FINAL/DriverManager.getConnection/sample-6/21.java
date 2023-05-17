public class func{
public void createConnection(boolean autoCommit){
        Connection connection = DriverManager.getConnection("jdbc:postgresql:
        connection.setAutoCommit(autoCommit);
}
}
