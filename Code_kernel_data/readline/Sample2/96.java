//95
public class func{
	public void testSendMessage(){
    ss = new SocketService(portNumber, new HelloService());
    Socket s = new Socket("localhost", portNumber);
    BufferedReader br = GetBufferedReader(s);
    String answer = br.readLine();
}
}
