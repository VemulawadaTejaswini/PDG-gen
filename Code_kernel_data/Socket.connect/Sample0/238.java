//237
public class func{
	public void tunnel(){
      clientSocket.connect(new InetSocketAddress(targetHost, targetPort));
      request.host(targetHost);
      request.port(targetPort);
      request.setHostHeader();
      onRequest(request);
}
}
