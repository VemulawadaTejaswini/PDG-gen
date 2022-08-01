//22
public class func{
	public void load(String url,int max_millis_to_wait){
          sock.connect( new InetSocketAddress( "127.0.0.1", i ), 500 );
          sock.setSoTimeout( 5000 );
          PrintWriter  pw = new PrintWriter( sock.getOutputStream());
          pw.println( "GET " + url + " HTTP/1.1" + NL + NL );
          pw.flush();
}
}
