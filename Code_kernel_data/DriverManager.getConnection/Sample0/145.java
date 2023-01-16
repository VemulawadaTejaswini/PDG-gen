//144
public class func{
	public void getConnection(boolean tenantSpecific,String tenantId){
            checkNotNull(tenantId);
            return createTenantConnection(tenantId);
        return DriverManager.getConnection(getUrl());
}
}
