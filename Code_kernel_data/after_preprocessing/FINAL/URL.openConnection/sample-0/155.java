public class func{
public void getBitmapFromURL(String source){
            URL url = new URL(source);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.setDoInput(true);
            httpConnection.connect();
            InputStream inputStream = httpConnection.getInputStream();
            return BitmapFactory.decodeStream(inputStream);
            Log.e(TAG, "getBitmapFromUrl: " + source, e);
}
}
