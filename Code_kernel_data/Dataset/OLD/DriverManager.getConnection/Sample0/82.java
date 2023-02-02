//81
public class func{
	public void connect(final ConnectionInfo connectionInfo,final Boolean readOnly){
      Class.forName(jdbcInfo.getDriverClass());
      jdbcConnection = DriverManager.getConnection(jdbcInfo.getConnectionString(), jdbcInfo.getProperties());
}
}
