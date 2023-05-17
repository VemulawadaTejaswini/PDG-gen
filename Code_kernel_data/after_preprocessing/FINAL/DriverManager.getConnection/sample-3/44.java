public class func{
public void testAmbiguousColumn(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.executeQuery();
}
}
