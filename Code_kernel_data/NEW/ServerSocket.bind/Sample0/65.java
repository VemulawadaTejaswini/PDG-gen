//64
public class func{
	public void activeConnectionShouldSendLocalId(){
        server.bind(new InetSocketAddress((InetAddress) null, pid2.getReplicaPort()));
        Socket socket = server.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        assertEquals(1, inputStream.readInt());
        inputStream.close();
}
}
