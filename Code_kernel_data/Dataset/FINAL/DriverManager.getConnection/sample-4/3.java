public class func{
public void setupConnection(){
        if (connection == null) {
            Connection newConnection = DriverManager.getConnection(url, username, password);
            newConnection.setAutoCommit(false);
            connection = newConnection;
        }
}
}
