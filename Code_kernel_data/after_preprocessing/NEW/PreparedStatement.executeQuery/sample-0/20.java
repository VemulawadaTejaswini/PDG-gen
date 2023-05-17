//20
public class func{
public void testSumDouble(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertTrue(Doubles.compare(rs.getDouble(1), 0.015)==0);
            assertFalse(rs.next());
            conn.close();
}
}
