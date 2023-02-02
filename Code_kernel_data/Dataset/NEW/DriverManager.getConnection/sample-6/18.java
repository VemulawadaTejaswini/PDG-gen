//18
public class func{
public void getConnection(String url,String user,String password){
        Connection connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
}
}
