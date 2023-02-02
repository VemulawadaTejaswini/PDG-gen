//76
public class func{
public void testStringConcatExpression(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setBytes(1, x);
            statement.executeQuery();
}
}
