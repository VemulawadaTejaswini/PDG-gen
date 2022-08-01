//277
public class func{
	public void main(String[] args){
            URL u = new URL ("http://127.0.0.1:"+port+"/foo\nbar");
            HttpURLConnection urlc = (HttpURLConnection)u.openConnection ();
            InputStream is = urlc.getInputStream();
}
}
