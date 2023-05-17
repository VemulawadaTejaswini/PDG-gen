public class func{
public void doCreateConnection(String driver,String url,String username,String password){
        return DriverManager.getConnection(url, username, password);
}
}
