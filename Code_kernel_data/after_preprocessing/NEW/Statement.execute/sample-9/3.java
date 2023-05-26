//3
public class func{
public void testEmptyQuery(){
        Statement stmt = con.createStatement();
        stmt.execute("");
        assertNull(stmt.getResultSet());
        assertTrue(!stmt.getMoreResults());
}
}
