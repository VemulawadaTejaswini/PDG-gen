//152
public class func{
	public void loadTileFromOsm(Tile tile){
        url = new URL(tile.getUrl());
        URLConnection urlConn = url.openConnection();
        if (urlConn instanceof HttpURLConnection) {
            prepareHttpUrlConnection((HttpURLConnection)urlConn);
        }
}
}
