//241
public class func{
public void testPreparedByte(){
        pstmt.setObject(2, new Byte((byte)2));
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        assertEquals((byte)1, rs.getByte(1));
}
}
