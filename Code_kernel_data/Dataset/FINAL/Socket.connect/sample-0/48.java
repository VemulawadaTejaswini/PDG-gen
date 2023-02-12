public class func{
public void stop(){
            socket.connect(new InetSocketAddress(InetAddress.getLoopbackAddress(), GSSTestConstants.PORT),
                    GSSTestConstants.SOCKET_TIMEOUT);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeInt(GSSTestConstants.CMD_STOP);
            dos.flush();
}
}
