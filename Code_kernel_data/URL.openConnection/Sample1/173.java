//172
public class func{
	public void getBugTrackerUrl(){
      final URL url = new URL(BUG_TRACKER_REFERENCE_URL);
      final BufferedReader in = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
      BUG_TRACKER_URL = in.readLine();
}
}
