public class func{
public void expectBadServerSingle(){
            server.bind(new InetSocketAddress(LOCALHOST, SERVER_PORT));
            Socket client = new Socket(LOCALHOST, SERVER_PORT);
}
}
