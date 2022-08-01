//261
public class func{
	public void testSignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        testSignedNumberSpec(conn, -123.1234);
}
}
