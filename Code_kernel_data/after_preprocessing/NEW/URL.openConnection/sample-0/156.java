//156
public class func{
public void getBitmapFromURL(String src){
      URL url = new URL(src);
      HttpURLConnection connection = (HttpURLConnection) url
          .openConnection();
      connection.setDoInput(true);
      connection.connect();
      InputStream input = connection.getInputStream();
      return BitmapFactory.decodeStream(input);
}
}
