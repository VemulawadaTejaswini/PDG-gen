//11
public class func{
public void testPercentileDiscOnDescPKColumn(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            long percentile_disc = rs.getLong(1);
            assertEquals(2, percentile_disc);
            assertFalse(rs.next());
            conn.close();
}
}
