//15
public class func{
	public void startupFinished(){
                clientSocket.connect(new InetSocketAddress(hostName, listenerPort), twoMinutes);
                clientSocket.setSoTimeout(twoMinutes);
                out = new DataOutputStream(clientSocket.getOutputStream());
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
}
}
