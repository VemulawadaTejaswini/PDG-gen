//3
public class func{
	public void testFakeCFDynamicUpsert(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(upsertquery);
            statement.executeQuery();
}
}
