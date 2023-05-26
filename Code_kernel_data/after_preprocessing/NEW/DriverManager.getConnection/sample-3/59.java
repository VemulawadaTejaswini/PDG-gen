//59
public class func{
public void testFullyQualifiedRVCInList(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(3, ROW5);
            ResultSet rs = statement.executeQuery();
}
}
