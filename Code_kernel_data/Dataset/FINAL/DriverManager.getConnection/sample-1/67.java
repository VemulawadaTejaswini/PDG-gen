public class func{
public void testDeletionOfParentTableFailsOnTenantSpecificConnection(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute("DROP TABLE TEMP_PARENT");
}
}
