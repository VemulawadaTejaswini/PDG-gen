//13
public class func{
public void executeTestRun(final InetAddress stunServerAddress,final int stunServerPort){
            socket.connect(new InetSocketAddress(stunServerAddress, stunServerPort));
            this.sendBindingRequestToStunServer(socket.getOutputStream());
            final Message response = this.receiveBindingResponseFromStunServer(socket.getInputStream());
            socket.close();
}
}
