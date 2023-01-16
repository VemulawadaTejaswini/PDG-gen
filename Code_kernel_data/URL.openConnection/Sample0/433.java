//432
public class func{
	public void getNotificationsJsonData(){
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(8000);
            return connection.getInputStream();
}
}
