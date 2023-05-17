//63
public class func{
public void shouldSendMessage(){
        server.bind(new InetSocketAddress((InetAddress) null, pid2.getReplicaPort()));
        Socket socket = server.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        assertEquals(1, inputStream.readInt());
}
}
