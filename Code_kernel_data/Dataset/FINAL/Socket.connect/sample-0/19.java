public class func{
public void sendArgs(String[] args,int max_millis_to_wait){
        sock.connect( new InetSocketAddress( "127.0.0.1", 6880 ), CONNECT_TIMEOUT );
        sock.setSoTimeout( READ_TIMEOUT );
           PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream(),"UTF-8"));
}
}
