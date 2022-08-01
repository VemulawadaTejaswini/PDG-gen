//236
public class func{
	public void testSimpleArgumentSelect(){
        PGobject pgo = new PGobject();
        pgo.setType("simplecompositetest");
        pgo.setValue("(1,2.2,)");
        pstmt.setObject(1, pgo);
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        PGobject pgo2 = (PGobject)rs.getObject(1);
        assertEquals(pgo, pgo2);
}
}
