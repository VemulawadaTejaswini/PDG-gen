//84
public class func{
	public void sendFileNotification(String serverBase,String fileName){
        URL url = new URL(serverBase + NOTIFICATION_PATH + fileName);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoOutput(true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));
        while ((line = reader.readLine()) != null) {
            log.info(line);
        }
        reader.close();
}
}
