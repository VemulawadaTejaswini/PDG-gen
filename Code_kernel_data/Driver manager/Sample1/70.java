//69
public class func{
	public void testAlterMultiTenantWithViewsToGlobal(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            conn.createStatement().execute("alter table " + PARENT_TABLE_NAME + " set MULTI_TENANT=false");
}
}
