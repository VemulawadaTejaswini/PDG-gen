public class func{
public void readStreamFromString(String filenameOrUrl){
    if (filenameOrUrl.matches("https?://")) {
      URL u = new URL(filenameOrUrl);
      URLConnection uc = u.openConnection();
      is = uc.getInputStream();
    } else {
      is = new FileInputStream(filenameOrUrl);
    }
    if (filenameOrUrl.endsWith(".gz")) {
      in = new ObjectInputStream(new GZIPInputStream(new BufferedInputStream(is)));
    } else {
      in = new ObjectInputStream(new BufferedInputStream(is));
    }
}
}
