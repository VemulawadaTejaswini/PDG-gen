//5
public class func{
public void getConnection(String url,String user,String pass){
        Properties props = new Properties();
        props.setProperty("password", pass);
        return DriverManager.getConnection(url, props);
}
}
