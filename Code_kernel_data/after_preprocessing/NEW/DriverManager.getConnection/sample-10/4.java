//4
public class func{
public void testVanityDriver(){
    Properties info = new Properties();
    info.setProperty("url", SPLUNK_URL);
    info.put("password", SPLUNK_PASSWORD);
        DriverManager.getConnection("jdbc:splunk:", info);
    connection.close();
}
}
