//95
public class func{
	public void openDownloadStream(String targetfile){
        URL url = makeURL(targetfile);
        urlc = url.openConnection();
        InputStream is = urlc.getInputStream();
}
}
