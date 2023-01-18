//64
public class func{
	public void test_0(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT 2");
        Assert.assertTrue(rs.next());
        Assert.assertEquals(2, rs.getInt(1));
        rs.close();
}
}
