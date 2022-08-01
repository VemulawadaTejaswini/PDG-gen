//120
public class func{
	public void testSelectColumnMoreThanOnce(){
        initEntityHistoryTableValues("abcd", getDefaultSplits("abcd"), date, 100l);
        ResultSet rs = DriverManager.getConnection(getUrl()).createStatement().executeQuery(query);
        assertTrue(rs.next());
        rs.getObject("NEW_VALUE");
        assertFalse(rs.next());
}
}
