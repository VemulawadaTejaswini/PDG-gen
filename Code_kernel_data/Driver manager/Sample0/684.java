//683
public class func{
	public void getConnection(LogChannelInterface log,DatabaseMeta dbMeta,String partitionId,int initialSize,int maximumSize){
    return DriverManager.getConnection( "jdbc:apache:commons:dbcp:" + buildPoolName( dbMeta, partitionId ) );
}
}
