public class func{
public void readFirstLineFromRsrc(String wktRsrcPath){
    InputStream is = getClass().getResourceAsStream(wktRsrcPath);
    assertNotNull(is);
      BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
      return br.readLine();
}
}
