//57
public class func{
	public void performBackgroundOperation(MediaItem[] params){
                            URL mediaUrl = new URL(mediaItem.getSource().toString());
                            HttpURLConnection connection = (HttpURLConnection) mediaUrl.openConnection();
                            connection.setRequestMethod("GET");
                            connection.connect();
                            responseCode = connection.getResponseCode();
}
}
