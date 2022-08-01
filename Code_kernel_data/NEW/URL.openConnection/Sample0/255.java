//254
public class func{
	public void main(String[] args){
            server = new HttpServer (new RelativeRedirect(), 1, 10, 0);
            URL url = new URL("http://localhost:"+server.getLocalPort());
            HttpURLConnection urlc = (HttpURLConnection)url.openConnection ();
            InputStream is = urlc.getInputStream ();
            is.close();
}
}
