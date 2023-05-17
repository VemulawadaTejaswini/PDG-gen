//714
public class func{
public void testInvalidateConnection(){
        Connection conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:test");
        assertNotNull(conn);
}
}
