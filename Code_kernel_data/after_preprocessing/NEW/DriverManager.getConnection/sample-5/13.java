//13
public class func{
public void testAmbiguousStaticUpsert(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(upsertquery);
            statement.execute();
}
}
