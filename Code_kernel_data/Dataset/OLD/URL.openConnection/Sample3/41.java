//40
public class func{
	public void connect(){
            URL url = bundle.getEntry(bundlePath);
            if (url == null) {
                throw new IOException("Cannot find entry " + bundlePath
                    + " in bundle " + bundle + " for URL " + url);
            }
            delegatee = url.openConnection();
}
}
