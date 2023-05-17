//472
public class func{
public void getTenantConnection(String tenantId){
        return DriverManager.getConnection(getUrl(), tenantProps);
}
}
