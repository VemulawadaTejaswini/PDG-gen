//8
public class func{
public void testCompareLongGTDecimal(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(2, rs.getLong(1));
            assertFalse(rs.next());
            conn.close();
}
}
