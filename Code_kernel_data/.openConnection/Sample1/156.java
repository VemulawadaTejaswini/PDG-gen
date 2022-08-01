//155
public class func{
	public void doInBackground(final Void... params){
                URL url = new URL("https://www.digipost.no/post/api/session");
                URLConnection connection = url.openConnection();
                connection.setConnectTimeout(3000);
                connection.connect();
}
}
