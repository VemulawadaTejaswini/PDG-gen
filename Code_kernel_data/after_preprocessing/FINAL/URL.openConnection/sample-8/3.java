public class func{
public void readReaderFromString(String textFileOrUrl){
    if (textFileOrUrl.matches("https?://.*")) {
      URL u = new URL(textFileOrUrl);
      URLConnection uc = u.openConnection();
      is = uc.getInputStream();
    } else {
      is = new FileInputStream(textFileOrUrl);
    }
    if (textFileOrUrl.endsWith(".gz")) {
      in = new BufferedReader(new InputStreamReader(new GZIPInputStream(is)));
    } else {
      in = new BufferedReader(new InputStreamReader(is));
    }
}
}
