public class func{
public void testFakeCFDynamicUpsert(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(upsertquery);
            statement.execute();
}
}
