//1
public class func{
public void testAmbiguousStaticSelect(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(upsertquery);
            statement.executeQuery();
}
}
