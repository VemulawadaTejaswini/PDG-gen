//47
public class func{
	public void doInBackground(Void... params){
            URL url = new URL("http:" + uri.toString().substring(5));
            URLConnection connection = url.openConnection();
            connection.connect();
            addSceneDirectory(connection.getInputStream());
            toast("Unable to open URI " + uri);
}
}
