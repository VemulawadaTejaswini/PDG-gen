//239
public class func{
	public void testCreateEmptyArrayOfIntViaAlias(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT ?::int[]");
        pstmt.setArray(1, _conn.createArrayOf("integer", in));
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        Array arr = rs.getArray(1);
        Integer out[] = (Integer [])arr.getArray();
}
}
