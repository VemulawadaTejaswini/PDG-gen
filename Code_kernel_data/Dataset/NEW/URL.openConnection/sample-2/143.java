//143
public class func{
public void download(String resource){
      URL url = parseURL(resource);
      URLConnection urlConnection = url.openConnection();
      String destination = calculateDesintationFile(url, urlConnection);
      downloadData(urlConnection, destination);
}
}
