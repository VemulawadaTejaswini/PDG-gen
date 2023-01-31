//163
public class func{
	public void testQueryCacheTimestamp(){
        deleteDb("optimizations");
        Connection conn = getConnection("optimizations");
        PreparedStatement prep = conn.prepareStatement(
                "SELECT CURRENT_TIMESTAMP()");
        ResultSet rs = prep.executeQuery();
        rs.next();
        String a = rs.getString(1);
}
}
