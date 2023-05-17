public class func{
public void loadInBackground(){
        final URL url = new URL(mUrl);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoInput(true);
        connection.connect();
        final InputStream input = connection.getInputStream();
        final Bitmap myBitmap = BitmapFactory.decodeStream(input);
}
}
