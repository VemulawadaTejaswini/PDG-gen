public class func{
public void run(){
          URL u = new URL(urlString);
          HttpsURLConnection c = (HttpsURLConnection)u.openConnection();
          c.connect();
          setText("" + c.getResponseCode() + " "
              + c.getResponseMessage(), false);
          c.disconnect();
}
}
