//303
public class func{
	public void shutdownDb(String jvmVersion,String serverHost,int serverPort,String dbPath,String replicatedDb,String clientHost){
            DriverManager.getConnection(dbURL+";shutdown=true");
}
}
