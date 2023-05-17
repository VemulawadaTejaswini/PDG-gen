public class func{
public void createConnection(){
        Connection c = DriverManager.getConnection(connectionUri, userName,
                password);
        c.setAutoCommit(false);
}
}
