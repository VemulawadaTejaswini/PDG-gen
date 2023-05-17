public class func{
public void testWhereStringConcatExpression(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2));
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs=statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(ROW2, rs.getString(1));
            assertFalse(rs.next());
            conn.close();
}
}
