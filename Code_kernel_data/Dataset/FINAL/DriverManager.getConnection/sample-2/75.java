public class func{
public void test_1(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT NULL");
        Assert.assertTrue(rs.next());
        Assert.assertEquals(0, rs.getInt(1));
        Assert.assertEquals(null, rs.getObject(1));
        rs.close();
}
}
