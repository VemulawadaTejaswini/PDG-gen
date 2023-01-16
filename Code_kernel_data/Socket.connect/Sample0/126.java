//125
public class func{
	public void connect(){
                socket.connect(new InetSocketAddress(hostname, port));
                channel = new PacketChannel(socket);
                if (channel.getInputStream().peek() == -1) {
                    throw new EOFException();
                }
}
}
