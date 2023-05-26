//4
public class func{
public void testRangeQuery3(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(30, rs.getInt(1));
            assertEquals(300L, rs.getLong(2));
            assertEquals("c", rs.getString(3));
            assertFalse(rs.next());
            conn.close();
}
}
