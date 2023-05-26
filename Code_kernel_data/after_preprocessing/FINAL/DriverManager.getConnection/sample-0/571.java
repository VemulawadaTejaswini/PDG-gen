public class func{
public void getConnection(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        return DriverManager.getConnection(URL, props);
}
}
