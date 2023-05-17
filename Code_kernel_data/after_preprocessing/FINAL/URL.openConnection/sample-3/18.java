public class func{
public void getTestListReader(String location){
      URL url = getTestListURL( location );
      if(url != null) {
        URLConnection connection = url.openConnection();
        return new LineNumberReader( new InputStreamReader( connection.getInputStream() ) );
      }
}
}
