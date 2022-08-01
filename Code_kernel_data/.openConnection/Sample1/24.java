//23
public class func{
	public void getURLImage(String source){
            URL url = new URL(source);
            URLConnection conn = url.openConnection();
            if(conn.getContentLength() > MAX_LENGTH) return null;
            return BitmapFactory.decodeStream(conn.getInputStream());
}
}
