public class func{
public void issueRequest(String targetHost,int targetPort,String forPlayerName,String requestContent,int timeoutClock,Map<String,String> extraHeaders){
      InetAddress theHost = InetAddress.getByName(targetHost);
      socket.connect(new InetSocketAddress(theHost.getHostAddress(), targetPort), 5000);
      HttpWriter.writeAsClient(socket, theHost.getHostName(), requestContent, forPlayerName, extraHeaders);
}
}
