//223
public class func{
	public void testCachingResultsCheckResult(PreparedStatement ps,int expected){
        ResultSet rs = ps.executeQuery();
        rs.next();
        assertEquals(expected, rs.getInt(1));
}
}
