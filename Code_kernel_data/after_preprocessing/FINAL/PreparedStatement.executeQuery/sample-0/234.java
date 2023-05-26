public class func{
public void testCreateEmptyArrayOfIntViaAlias(){
    PreparedStatement pstmt = conn.prepareStatement("SELECT ?::int[]");
    pstmt.setArray(1, conn.createArrayOf("integer", in));
    ResultSet rs = pstmt.executeQuery();
    assertTrue(rs.next());
    Array arr = rs.getArray(1);
    Integer[] out = (Integer[]) arr.getArray();
}
}
