//445
public class func{
public void createConnection(String driver,String url,String user,String password){
        return DriverManager.getConnection(url, user, password);
}
}
