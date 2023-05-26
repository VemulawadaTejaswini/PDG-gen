//88
public class func{
public void getConnection(String driver,String url,Properties prop){
    DriverManager.setLoginTimeout(1);
    return DriverManager.getConnection(url, prop);
}
}
