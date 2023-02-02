//21
public class func{
	public void deliverVoxVerification(String destination,String message){
    URL url = new URL(String.format(NEXMO_VOX_URL, apiKey, apiSecret, destination,
                                    URLEncoder.encode(SmsSender.VOX_VERIFICATION_TEXT + message, "UTF-8")));
    URLConnection connection = url.openConnection();
    connection.setDoInput(true);
    connection.connect();
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    while ((line = reader.readLine()) != null) {
      logger.debug(line);
    }
    reader.close();
}
}
