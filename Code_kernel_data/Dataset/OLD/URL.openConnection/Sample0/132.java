//131
public class func{
	public void executeHttpPost(InputStream data,String url){
    HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
    http.setChunkedStreamingMode(1024 * 1024);
    http.setRequestMethod("POST");
    http.setRequestProperty("Content-Type", "application/octet-stream");
    http.setDoOutput(true);
    IOUtils.copy(data, http.getOutputStream());
    http.getOutputStream().flush();
    http.getOutputStream().close();
}
}
