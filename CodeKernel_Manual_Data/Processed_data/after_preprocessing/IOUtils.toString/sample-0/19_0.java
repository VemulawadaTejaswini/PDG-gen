public class dummy {
public String get(String get) {
    URL url;
    try {
      url = new URL(get);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    } 
    if (url.getProtocol().equalsIgnoreCase("file"))
      try {
        FileInputStream fileInputStream = new FileInputStream(new File(url.getPath()));
        return IOUtils.toString(fileInputStream, "UTF-8");
      } catch (IOException e) {
        throw new RuntimeException(e);
      }  
    try {
      return internalGet(url);
    } catch (ClientProtocolException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    } 
  }
}