public class func{
public void readXMLFromJarURL(URL url){
    URLConnection urlConnection = url.openConnection();
    assertTrue("URL is not a JarURL", urlConnection instanceof JarURLConnection);
    BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
      String firstLine = reader.readLine();
      assertEquals("Unexpected first line", "<?xml version=\"1.0\"", firstLine.substring(0, 19));
      reader.close();
}
}
