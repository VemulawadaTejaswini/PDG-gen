public class func{
public void testConnectWithHash(){
        String pwd = StringUtils.convertBytesToHex(
                SHA256.getKeyPasswordHash("SA", "sa".toCharArray()));
        Connection conn2 = DriverManager.getConnection(
                "jdbc:h2:mem:test;PASSWORD_HASH=TRUE", "sa", pwd);
}
}
