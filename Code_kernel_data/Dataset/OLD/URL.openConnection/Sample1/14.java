//13
public class func{
	public void checkUpdate(String s){
      URL url = new URL(s);
      URLConnection conn = url.openConnection();
      BufferedReader in = new BufferedReader( 
            new InputStreamReader( conn.getInputStream()));
      if ((line = in.readLine()) != null){
         version = line.trim();
         details = "";
         while( (line = in.readLine()) != null )
            details += line;
         return true;
      }
}
}
