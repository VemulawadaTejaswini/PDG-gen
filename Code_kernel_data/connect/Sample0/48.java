//47
public class func{
	public void main(String args[]){
        int port = Integer.parseInt(portStr);
        socket.connect(new InetSocketAddress("127.0.0.1", port), 9 * 1000);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        out.write(args[1]);
        out.newLine();
        out.flush();
}
}
