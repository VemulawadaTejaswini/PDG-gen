//89
public class func{
	public void testCachingResultsCheckResult(PreparedStatement ps,int expected,String value){
        ps.setString(1, value);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            counter++;
            String result = rs.getString(1);
            assertEquals(result, value);
        }
        assertEquals(expected, counter);
}
}
