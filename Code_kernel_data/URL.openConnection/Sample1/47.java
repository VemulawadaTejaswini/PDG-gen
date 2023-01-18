//46
public class func{
	public void run(){
        URLConnection conn = new URL(readyURL).openConnection();
        InputStream in = conn.getInputStream();
        while (in.read() != -1)
          ;
        in.close();
}
}
