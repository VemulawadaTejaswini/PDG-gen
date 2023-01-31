//5
public class func{
	public void testOrderByNotInSelectDistinct(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.executeQuery();
}
}
