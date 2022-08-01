//224
public class func{
	public void verify(String url,RequestParameters requestParameters){
            URLConnection uc = new URL(url).openConnection();
            uc.setDoOutput(true);
            uc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(uc.getOutputStream(), Charsets.UTF_8));
}
}
