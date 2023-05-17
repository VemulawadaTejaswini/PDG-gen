//132
public class func{
public void hasOsmTileETag(String eTag){
            url = new URL(tile.getUrl());
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            prepareHttpUrlConnection(urlConn);
            urlConn.setRequestMethod("HEAD");
            urlConn.setReadTimeout(30000); // 30 seconds read timeout
            String osmETag = urlConn.getHeaderField("ETag");
            if (osmETag == null)
                return true;
            return (osmETag.equals(eTag));
}
}
