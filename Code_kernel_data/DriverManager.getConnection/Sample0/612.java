//611
public class func{
	public void getConnection(){
    return ( auditDs != null ? auditDs.getConnection() : DriverManager.getConnection( AuditConnection.DRIVER_URL,
        AuditConnection.DRIVER_USERID, AuditConnection.DRIVER_PASSWORD ) );
}
}
