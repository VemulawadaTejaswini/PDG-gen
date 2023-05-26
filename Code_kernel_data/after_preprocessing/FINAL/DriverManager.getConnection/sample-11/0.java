public class func{
public void createConnection(Properties p){
        Properties props = new java.util.Properties();
        props.put("password", pass);
        return DriverManager.getConnection(url, props);
}
}
