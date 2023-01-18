//238
public class func{
	public void testComplexSelect(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT '(\"{1,2}\",{},\"(1,2.2,)\")'::\"Composites\".\"ComplexCompositeTest\"");
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        PGobject pgo = (PGobject)rs.getObject(1);
        assertEquals("\"Composites\".\"ComplexCompositeTest\"", pgo.getType());
        assertEquals("(\"{1,2}\",{},\"(1,2.2,)\")", pgo.getValue());
}
}
