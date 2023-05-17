public class func{
public void testFalseOrFalse(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        ResultSet rs = conn.createStatement().executeQuery("SELECT (FALSE OR FALSE) AS B FROM SYSTEM.CATALOG LIMIT 1");
        assertTrue(rs.next());
        assertFalse(rs.getBoolean(1));
        conn.close();
}
}
