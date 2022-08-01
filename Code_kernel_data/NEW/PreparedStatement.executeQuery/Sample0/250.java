//249
public class func{
	public void testSimple(){
        Connection conn = pcds.getPooledConnection().getConnection();
        assertNotNull(conn);
        PreparedStatement stmt = conn.prepareStatement("select * from dual");
        assertNotNull(stmt);
        ResultSet rset = stmt.executeQuery();
        assertNotNull(rset);
        assertTrue(rset.next());
        rset.close();
}
}
