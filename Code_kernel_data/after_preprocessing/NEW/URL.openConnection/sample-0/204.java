//204
public class func{
public void getCopyOfBitmap(){
                URL url = new URL(TULIP_IMG_URL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                sBitmap = ShadowBitmapFactory.decodeStream(input);
}
}
