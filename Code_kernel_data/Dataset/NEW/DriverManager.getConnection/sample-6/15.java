//15
public class func{
public void getConnection(String username,String password){
        Connection connection = DriverManager.getConnection(url, username, password);
        connection.setAutoCommit(false);
}
}
