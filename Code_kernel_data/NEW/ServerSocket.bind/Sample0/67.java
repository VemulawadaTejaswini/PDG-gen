//66
public class func{
	public void expectBadClientSingle(){
            server.bind(new InetSocketAddress(LOCALHOST, SERVER_PORT));
            return badSend(new Socket(LOCALHOST, SERVER_PORT), server.accept(), null);
}
}
