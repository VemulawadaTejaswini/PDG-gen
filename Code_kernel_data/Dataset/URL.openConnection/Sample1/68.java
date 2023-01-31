//67
public class func{
	public void client(String u){
        URL url = new URL (u);
        URLConnection urlc = url.openConnection ();
        InputStream is = urlc.getInputStream ();
        read (is);
        is.close();
}
}
