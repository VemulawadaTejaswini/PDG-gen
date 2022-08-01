//4
public class func{
	public void queryServerPing(InetSocketAddress address){
            socket = new Socket();
            socket.connect(address, CONNECT_TIMEOUT);
            socket.setSoTimeout(READ_TIMEOUT);
            output = socket.getOutputStream();
            input = socket.getInputStream();
            DataOutputStream data = new DataOutputStream(output);
}
}
