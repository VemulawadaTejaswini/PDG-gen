//133
public class func{
	public void main(String[] args){
            URL url = new URL ("http://localhost:"+port+"/index.html");
            URLConnection urlc = url.openConnection ();
            urlc.setIfModifiedSince (10000000);
            InputStream is = urlc.getInputStream ();
}
}
