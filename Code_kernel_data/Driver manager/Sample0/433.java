//432
public class func{
	public void getConnectionWithTracingFrequency(Properties props,Tracing.Frequency frequency){
        return DriverManager.getConnection(getUrl(), props);
}
}
