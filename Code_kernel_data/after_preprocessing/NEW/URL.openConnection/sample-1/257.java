//257
public class func{
public void get(String pdbId){
      URL url = new URL(URL_STUB + pdbId);
      is = url.openConnection().getInputStream();
}
}
