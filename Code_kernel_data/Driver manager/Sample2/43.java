//42
public class func{
	public void testCount(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 1));
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select count(1) from " + GROUPBYTEST_NAME);
        assertTrue(rs.next());
        assertEquals(8, rs.getInt(1));
        assertFalse(rs.next());
        conn.close();
}
}
