//56
public class func{
	public void testConnection(){
    hs2Conn = DriverManager.getConnection(
        miniHS2.getJdbcURL() + ";auth=noSasl", sessionUserName, "foo");
}
}
