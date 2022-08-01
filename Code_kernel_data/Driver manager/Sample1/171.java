//170
public class func{
	public void testDropSystemTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
                conn.createStatement().executeUpdate(
                        "DROP TABLE " + PhoenixDatabaseMetaData.SYSTEM_CATALOG);
}
}
