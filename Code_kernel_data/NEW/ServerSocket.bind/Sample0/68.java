//67
public class func{
	public void run(){
                server.bind(new InetSocketAddress( _port ) );
                s = server.accept();
                TunnelSocket ts = (TunnelSocket)s;
                ts.verify();
                System.out.println( ts.getSubject() );
}
}
