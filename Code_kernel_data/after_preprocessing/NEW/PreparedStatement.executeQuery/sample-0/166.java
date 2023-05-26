//166
public class func{
public void testInstrFilter(Connection conn,String queryToExecute,String expected){
        PreparedStatement stmt = conn.prepareStatement(queryToExecute);
        rs = stmt.executeQuery();
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
}
}
