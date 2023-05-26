//169
public class func{
public void testDisallowDropParentTableWithExistingTenantTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            conn.createStatement().executeUpdate("drop table " + PARENT_TABLE_NAME);
}
}
