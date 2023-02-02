//37
public class func{
public void getUrl(String path){
    URL xqtl = new URL("http://localhost:" + webserverport + path);
    URLConnection xc = xqtl.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(xc.getInputStream()));
    while ((inputLine = in.readLine()) != null)
    {
      res.add(inputLine);
    }
    in.close();
}
}
