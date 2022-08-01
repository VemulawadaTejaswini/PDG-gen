//28
public class func{
	public void downloadBitmap(String url){
      URLConnection connection = new URL(url).openConnection();
      connection.connect();
      InputStream is = connection.getInputStream();
      bitmap = BitmapFactory.decodeStream(is);
      is.close();
}
}
