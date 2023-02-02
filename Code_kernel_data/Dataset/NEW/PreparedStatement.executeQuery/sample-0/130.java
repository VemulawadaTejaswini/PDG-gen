//130
public class func{
public void testFloatMAX_VALUE(Connection conn){
        PreparedStatement ps = conn.prepareStatement("select * from jira1136");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertEquals(3.4028235E38, rs.getFloat(1), .00001);

        }
}
}
