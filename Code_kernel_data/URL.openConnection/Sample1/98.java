//97
public class func{
	public void test(){
        ServerSocket ss = new ServerSocket(0);
        Server s = new Server (ss);
            URL url = new URL ("http://127.0.0.1:"+ss.getLocalPort());
            URLConnection urlc = url.openConnection ();
            InputStream is = urlc.getInputStream ();
}
}
