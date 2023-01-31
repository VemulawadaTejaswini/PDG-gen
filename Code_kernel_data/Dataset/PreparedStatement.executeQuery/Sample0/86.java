//85
public class func{
	public void checkDbName(Connection conn,String expectedDbName){
        PreparedStatement ps = conn.prepareStatement("values syscs_util.SYSCS_GET_DATABASE_NAME()");
        ResultSet rs = ps.executeQuery();
        rs.next();
        assertEquals( rs.getString( 1 ),  expectedDbName);
        rs.close();
}
}
