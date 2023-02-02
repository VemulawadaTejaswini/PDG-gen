//3
public class func{
public void testUnfoundMultiColumnCaseStatement(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
}
}
