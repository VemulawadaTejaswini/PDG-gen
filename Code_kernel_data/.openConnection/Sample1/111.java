//110
public class func{
	public void main(String[] args){
            URL url = new URL("http://127.0.0.1:"+port);
            java.net.URLConnection uc = url.openConnection();
            uc.setReadTimeout(1000);
            uc.getInputStream();
}
}
