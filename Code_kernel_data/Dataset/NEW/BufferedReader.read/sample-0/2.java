//2
public class func{
public void readText(InputStream is,String charset){
    if (charset==null||charset.isEmpty()||charset.equalsIgnoreCase("tika")) {
      reader = new BufferedReader(new InputStreamReader(is));
    } else {
      reader = new BufferedReader(new InputStreamReader(is,charset));
    }
    while ((c = reader.
}
}
