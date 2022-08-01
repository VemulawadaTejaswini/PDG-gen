//144
public class func{
	public void exists(){
  if (pathUrlConnection == null)
  try {
    URL u = new URL(path);
    pathUrlConnection = u.openConnection();
  } catch (MalformedURLException e) {
  } catch (IOException e) {
  }
  if ( pathUrlConnection != null )
  try {
    int responseCode = ((HttpURLConnection)pathUrlConnection).getResponseCode();
    if (responseCode >= 200 && responseCode < 300) // Successful
      return true;
  } catch (IOException e) {
  }
}
}
