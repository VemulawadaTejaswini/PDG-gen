//319
public class func{
	public void method1(){
    String imei = TelephonyManager.getDeviceId();
      URL url = new URL(imei);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
}
}
