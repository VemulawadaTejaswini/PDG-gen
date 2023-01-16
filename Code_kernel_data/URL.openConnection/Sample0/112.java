//111
public class func{
	public void getUrlBytes(String urlToRead){
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            InputStream in = conn.getInputStream();
                return IOUtils.toByteArray(in);
                in.close();
}
}
