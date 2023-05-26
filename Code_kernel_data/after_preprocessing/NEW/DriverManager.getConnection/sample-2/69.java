//69
public class func{
public void test_2(){
        Connection conn = DriverManager.getConnection("jdbc:mock:");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT NOW()");
        Assert.assertTrue(rs.next());
        Assert.assertTrue(rs.getObject(1) instanceof Timestamp);
        rs.close();
}
}
