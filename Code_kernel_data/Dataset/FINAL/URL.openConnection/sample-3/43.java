public class func{
public void createAssetURLConnection(final String path){
        final URL url = AssetURLContext.createURL(path);
        final URLConnection c = url.openConnection();
        System.err.println("createAssetURL: "+path+" -> url: "+url+" -> conn: "+c+" / connURL "+(null!=c?c.getURL():null));
}
}
