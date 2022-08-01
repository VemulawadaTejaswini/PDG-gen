//389
public class func{
	public void doesUrlExistAndIsImage(URL url){
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("HEAD");
            boolean result = (con.getResponseCode() == HttpURLConnection.HTTP_OK)
                    && con.getContentType().contains("image");
            con.disconnect();
}
}
