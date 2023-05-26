public class func{
public void test_getNCharacterStream_1(){
        Connection conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement("select ?");
        stmt.setNull(1, Types.VARCHAR);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        Assert.assertNull(rs.getNCharacterStream("1"));
        rs.close();
}
}
