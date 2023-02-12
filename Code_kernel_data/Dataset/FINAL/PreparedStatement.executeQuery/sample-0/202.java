public class func{
public void testPreparedFunction(){
    PreparedStatement pstmt = con.prepareStatement("SELECT {fn concat('a', ?)}");
    pstmt.setInt(1, 5);
    ResultSet rs = pstmt.executeQuery();
    assertTrue(rs.next());
    assertEquals("a5", rs.getString(1));
}
}
