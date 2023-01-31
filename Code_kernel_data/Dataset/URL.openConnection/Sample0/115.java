//114
public class func{
	public void checkURLisReachable(String url){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);
            int responseCode = connection.getResponseCode();
            if (200 <= responseCode && responseCode <= 399) {
                return null;
            }
            return String.format("The update server is unreachable: The attempt to connect to the update server has resulted in %d code.", responseCode);
}
}
