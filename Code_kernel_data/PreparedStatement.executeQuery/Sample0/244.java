//243
public class func{
	public void testNullArrayElement(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT array[NULL, NULL]::compositetabletest[]");
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        Array arr = rs.getArray(1);
        assertEquals("compositetabletest", arr.getBaseTypeName());
        Object[] items = (Object[])arr.getArray();
}
}
