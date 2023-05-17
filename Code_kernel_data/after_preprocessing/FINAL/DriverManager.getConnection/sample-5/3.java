public class func{
public void testAmbiguousDynamicUpsert(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(upsertquery);
            statement.execute();
}
}
