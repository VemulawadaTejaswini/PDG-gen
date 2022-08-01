//79
public class func{
	public void testSingleBinaryPaddedKeyExpression(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES));
        conn.createStatement().execute("create table bintable (k BINARY(15) PRIMARY KEY)");
}
}
