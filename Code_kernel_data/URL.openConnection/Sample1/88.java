//87
public class func{
	public void testUrlWithSpaceInHost(){
        URLConnection urlConnection = new URL("http://and roid.com/").openConnection();
            urlConnection.getInputStream();
}
}
