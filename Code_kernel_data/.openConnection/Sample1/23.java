//22
public class func{
	public void deliverSmsVerification(String destination,String verificationCode){
    URL url = new URL(String.format(NEXMO_SMS_URL, apiKey, apiSecret, number, destination,
                                    URLEncoder.encode(SmsSender.SMS_VERIFICATION_TEXT + verificationCode, "UTF-8")));
    URLConnection connection = url.openConnection();
    connection.setDoInput(true);
    connection.connect();
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    while (reader.readLine() != null) {}
    reader.close();
}
}
