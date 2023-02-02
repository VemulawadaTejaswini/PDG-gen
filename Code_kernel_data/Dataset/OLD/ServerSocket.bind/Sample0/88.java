//87
public class func{
	public void createServerSocket(int nport,int backlog,InetAddress bindAddr,int socketBufferSize){
            result.bind(new InetSocketAddress(bindAddr, nport), backlog);
            BindException throwMe = new BindException(LocalizedStrings.SocketCreator_FAILED_TO_CREATE_SERVER_SOCKET_ON_0_1.toLocalizedString(new Object[] {bindAddr, Integer.valueOf(nport)}));
            throwMe.initCause(e);
}
}
