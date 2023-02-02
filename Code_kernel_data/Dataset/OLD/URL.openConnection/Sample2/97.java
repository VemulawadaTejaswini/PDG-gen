//96
public class func{
	public void openUploadStream(String targetfile){
        URL url = makeURL(targetfile);
        urlc = url.openConnection();
        OutputStream os = urlc.getOutputStream();
}
}
