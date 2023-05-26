//48
public class func{
public void testJoinWithIncomparableJoinKeyTypes(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.executeQuery();
}
}
