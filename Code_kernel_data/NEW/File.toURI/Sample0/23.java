//22
public class func{
	public void ensureFilePathIsUrl(String url){
        if (isFilePath(url) && !url.startsWith("file:")) {
            try {
                return new File(url).toURI().toURL().toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
}
}
