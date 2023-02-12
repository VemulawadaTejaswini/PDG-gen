public class func{
public void getConnection(String db){
        Properties prop = new Properties();
        prop.setProperty("password", "");
        return DriverManager.getConnection(url, prop);
}
}
