public class func{
public void getreal(String nm){
      URL url = new URL(Config.mapurl, nm + ".png");
      URLConnection c = url.openConnection();
      c.addRequestProperty("User-Agent", "Haven/1.0");
      InputStream s = c.getInputStream();
}
}
