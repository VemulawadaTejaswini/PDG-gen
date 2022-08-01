//519
public class func{
	public void getTenantSpecificConnection(String tenantId){
        Connection conn = DriverManager.getConnection(getUrl(), tenantProps);
}
}
