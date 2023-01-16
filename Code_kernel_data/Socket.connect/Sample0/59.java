//58
public class func{
	public void openSocket(){
                    tempSocket.connect(new InetSocketAddress(remoteHost, port), acceptConnectionTimeout);
                    tempOutputStream = new BufferedOutputStream(tempSocket.getOutputStream(), writeBufferSize);
                    encoder.init(tempOutputStream);
}
}
