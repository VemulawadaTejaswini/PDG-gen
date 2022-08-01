//61
public class func{
	public void test_4(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT 'ABCDE' FROM DUAL");
        Assert.assertTrue(rs.next());
        Assert.assertEquals("ABCDE", rs.getString(1));
        rs.close();
}
}
