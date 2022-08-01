//282
public class func{
	public void streamFromSocket(SourceContext<String> ctx,Socket socket){
              socket.connect(new InetSocketAddress(hostname, port),
                  CONNECTION_TIMEOUT_TIME);
}
}
