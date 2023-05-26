public class func{
public void testAllManPages(){
      InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("help");
      BufferedReader r = new BufferedReader(new InputStreamReader(is));
      for(String name = r.readLine(); name != null; name = r.readLine()) {
         testManPage("help/"+name);
      }
      r.close();
}
}
