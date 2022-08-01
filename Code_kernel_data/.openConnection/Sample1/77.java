//76
public class func{
	public void main(String args[]){
            URL url = new URL ("http://localhost:"+port+"/d1/d2/d3/foo.html");
            URLConnection urlc = url.openConnection ();
            InputStream is = urlc.getInputStream ();
            read (is);
            is.close ();
}
}
