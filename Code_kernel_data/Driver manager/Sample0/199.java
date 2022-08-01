//198
public class func{
	public void createTenantConnection(String tenantId){
        return DriverManager.getConnection(getUrl(), props);
}
}
