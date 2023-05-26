//2
public class func{
public void getConnection(){
        Properties props = new Properties();
        props.setProperty("password",_passwd);
        return DriverManager.getConnection(_url, props);
}
}
