//237
public class func{
	public void testPreparedStatementMissingParameter(){
        final PreparedStatement ps = conn.prepareStatement("start n=node({1}) return ID(n) as id");
        final ResultSet rs = ps.executeQuery();
        rs.next();
}
}
