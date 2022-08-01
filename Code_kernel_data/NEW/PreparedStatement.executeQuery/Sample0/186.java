//185
public class func{
	public void testBooleanBind(){
        assertTrue(((PGStatement)pstmt).isUseServerPrepare());
        pstmt.setBoolean(1, false);
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        assertEquals(9, rs.getInt(1));
        rs.close();
}
}
