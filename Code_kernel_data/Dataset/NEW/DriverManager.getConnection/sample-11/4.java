//4
public class func{
public void testUtf8Encoding(){
    Properties props = new Properties();
    props.put("jdbcCompliantTruncation", "false");
    Connection utfConn = DriverManager.getConnection(dbUrl, props);
    testConversionForString("UTF8", utfConn, "\u043c\u0438\u0445\u0438");
}
}
