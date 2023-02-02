//85
public class func{
	public void main(String[] args){
        int port = server.getLocalPort ();
        URL url = new URL ("http://127.0.0.1:"+port);
        URLConnection urlc = url.openConnection ();
        urlc.getInputStream ();
}
}
