//500
public class func{
	public void getSlaveConnection(){
            String url = slaveURL(replicatedDb);
            slaveConn = DriverManager.getConnection(url);
}
}
