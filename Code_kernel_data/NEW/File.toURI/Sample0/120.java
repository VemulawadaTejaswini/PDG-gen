//119
public class func{
	public void scan(TldScanner.TldScannerCallback callback,File webapp,String path){
        String fullPath = new File(webapp, path).toURI().toString();
        URL jarUrl = new URL("jar:" + fullPath + "!/");
        JarURLConnection connection = (JarURLConnection) jarUrl.openConnection();
        callback.scan(connection, path, true);
}
}
