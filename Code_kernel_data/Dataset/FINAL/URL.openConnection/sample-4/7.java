public class func{
public void readReaderFromString(String textFileOrUrl,String encoding){
    if (textFileOrUrl.matches("https?:
      URL u = new URL(textFileOrUrl);
      URLConnection uc = u.openConnection();
      is = uc.getInputStream();
    } else {
      is = new FileInputStream(textFileOrUrl);
    }
    if (textFileOrUrl.endsWith(".gz")) {
      is = new GZIPInputStream(is);
    }
    return new BufferedReader(new InputStreamReader(is, encoding));
}
}
