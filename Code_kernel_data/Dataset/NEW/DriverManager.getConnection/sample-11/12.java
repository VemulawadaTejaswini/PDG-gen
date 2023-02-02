//12
public class func{
public void getConnection(String url,String user,String password){
        Properties info = getJDBCConnectionProperties(user, password);
        info.put(READ_TIMEOUT_KEY, READ_TIMEOUT_VALUE);
        return DriverManager.getConnection(url, info);    
}
}
