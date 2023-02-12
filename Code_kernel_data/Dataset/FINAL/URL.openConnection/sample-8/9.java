public class func{
public void create(AssetManager assetManager,AssetKey key,URL url){
        URLConnection conn = url.openConnection();
        conn.setUseCaches(false);
        InputStream in = conn.getInputStream();
        if (in == null){
            return null;
        }else{
            return new UrlAssetInfo(assetManager, key, url, in);
        }
}
}
