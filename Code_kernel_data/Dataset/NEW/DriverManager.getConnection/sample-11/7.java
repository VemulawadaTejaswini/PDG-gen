//7
public class func{
public void testEncodingRegression(){
        Properties props = new Properties();
        props.put("useUnicode", "true");
        DriverManager.getConnection(dbUrl, props).close();
}
}
