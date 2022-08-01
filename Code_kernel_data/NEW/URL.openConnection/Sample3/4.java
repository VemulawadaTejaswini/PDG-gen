//3
public class func{
	public void openConnection(URL url){
        if (url.getProtocol().equals("https")) {
            for (String domain : sStaticCA.keySet()) {
                if (url.getHost().endsWith(domain)) {
                    return openCAConnection(sStaticCA.get(domain), url);
                }
            }
        }
        return url.openConnection();
}
}
