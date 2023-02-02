//1
public class func{
public void setRemoteImage(final URL aURL){
      final URLConnection conn = aURL.openConnection();
      conn.connect();
      final InputStream is = conn.getInputStream();
      final BufferedInputStream bis = new BufferedInputStream(is);
      final Bitmap bm = BitmapFactory.decodeStream(bis);
      bis.close();
}
}
