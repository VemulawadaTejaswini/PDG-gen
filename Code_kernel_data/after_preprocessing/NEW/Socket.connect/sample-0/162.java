//162
public class func{
public void createOutgoingSession(String domain,String hostname,int port){
                socket.connect(new InetSocketAddress(realHostname, realPort),
                        RemoteServerManager.getSocketTimeout());
                Log.debug("LocalOutgoingServerSession: OS - Plain connection to " + hostname + ":" + port + " successful");
}
}
