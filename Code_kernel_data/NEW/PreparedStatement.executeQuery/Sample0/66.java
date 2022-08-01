//65
public class func{
	public void testWrap(){
        Connection conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "xxx");
        ResultSet rs = stmt.executeQuery();
        rs.next();
        rs.close();
}
}
