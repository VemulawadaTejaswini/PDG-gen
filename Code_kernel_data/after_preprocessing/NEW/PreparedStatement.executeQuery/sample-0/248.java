//248
public class func{
public void testIsClosed(){
            Connection conn = newConnection();
            assertNotNull(conn);
            assertTrue(!conn.isClosed());
            PreparedStatement stmt = conn.prepareStatement("select * from dual");
            assertNotNull(stmt);
            ResultSet rset = stmt.executeQuery();
            assertNotNull(rset);
            assertTrue(rset.next());
            rset.close();
}
}
