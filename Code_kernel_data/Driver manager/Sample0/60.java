//59
public class func{
	public void testProxyAuth(){
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL("default",
        ";hive.server2.proxy.user=" + MiniHiveKdc.HIVE_TEST_USER_1));
    verifyProperty(SESSION_USER_NAME, MiniHiveKdc.HIVE_TEST_USER_1);
}
}
