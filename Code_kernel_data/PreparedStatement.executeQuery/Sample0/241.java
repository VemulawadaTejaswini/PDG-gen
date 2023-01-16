//240
public class func{
	public void testSimpleSelect(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT '(1,2.2,)'::simplecompositetest");
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        PGobject pgo = (PGobject)rs.getObject(1);
        assertEquals("simplecompositetest", pgo.getType());
        assertEquals("(1,2.2,)", pgo.getValue());
}
}
