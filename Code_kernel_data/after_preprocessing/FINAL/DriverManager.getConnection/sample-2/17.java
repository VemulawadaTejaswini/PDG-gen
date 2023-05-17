public class func{
public void testSettingsAsProperties(){
        String url = getURL("driver", true);
        Connection conn = DriverManager.getConnection(url, prop);
        rs = conn.createStatement().executeQuery(
                "select * from information_schema.settings where name='MAX_COMPACT_TIME'");
        rs.next();
        assertEquals(1234, rs.getInt(2));
        conn.close();
}
}
