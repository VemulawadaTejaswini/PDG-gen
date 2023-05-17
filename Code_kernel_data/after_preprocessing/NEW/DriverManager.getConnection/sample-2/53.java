//53
public class func{
public void testSelectAfterUpsertInQuery(){
        Connection conn = DriverManager.getConnection(getUrl());
        initSelectAfterUpsertTable(conn);
            ResultSet rs = conn.createStatement().executeQuery(query);
            assertTrue(rs.next());
            assertEquals(0, rs.getInt(1));
            conn.close();
}
}
