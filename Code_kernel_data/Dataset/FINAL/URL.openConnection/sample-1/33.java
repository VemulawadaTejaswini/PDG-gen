public class func{
public void process(Void... params){
      URL url = new URL(small.toString());
      URLConnection connection = url.openConnection();
      connection.connect();
      InputStream inputStream = connection.getInputStream();
      BufferedInputStream bufferedInputStream = new BufferedInputStream(
          inputStream);
      preview = BitmapFactory.decodeStream(bufferedInputStream);
      bufferedInputStream.close();
}
}
