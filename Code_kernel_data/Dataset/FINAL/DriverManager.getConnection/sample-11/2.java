public class func{
public void getConnection(){
    final Properties props = new Properties();
    props.put("password", HSQLUtil.PWD);
    return DriverManager.getConnection(HSQLUtil.URL, props);
}
}
