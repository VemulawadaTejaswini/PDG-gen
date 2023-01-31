//254
public class func{
	public void testUnsignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        testUnsignedNumberSpec(conn, 123.1234, 1);
}
}
