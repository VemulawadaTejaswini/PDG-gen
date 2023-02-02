//85
public class func{
public void createConnection(String user,String password){
    DriverManager.setLoginTimeout(0);
    Connection connection =  DriverManager.getConnection(url, user, password);
}
}
