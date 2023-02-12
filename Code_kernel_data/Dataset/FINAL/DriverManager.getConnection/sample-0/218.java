public class func{
public void getConnection(String serverHost,int serverPort,String databasePath,String dbSubPath,String replicatedDb){
        String connectionURL = serverURL( db, serverHost, serverPort );
        util.DEBUG(connectionURL);
        return DriverManager.getConnection(connectionURL);
}
}
