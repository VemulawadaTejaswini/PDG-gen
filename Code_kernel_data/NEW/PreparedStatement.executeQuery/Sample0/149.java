//148
public class func{
	public void testSearchStringEscape(){
    PreparedStatement pstmt = con.prepareStatement("SELECT 'a' LIKE ?, '_' LIKE ?");
    pstmt.setString(2, pattern);
    ResultSet rs = pstmt.executeQuery();
    assertTrue(rs.next());
    assertTrue(!rs.getBoolean(1));
    assertTrue(rs.getBoolean(2));
    rs.close();
}
}
