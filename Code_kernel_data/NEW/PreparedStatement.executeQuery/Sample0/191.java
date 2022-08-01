//190
public class func{
	public void testEmptyResults(){
            pstmt.setInt(1, -1);
            ResultSet rs = pstmt.executeQuery();
            assertFalse(rs.next());
            rs.close();
}
}
