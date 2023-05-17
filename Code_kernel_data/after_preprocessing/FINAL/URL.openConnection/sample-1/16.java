public class func{
public void getInputStream(String fileName){
    if (fileName.startsWith("http:")) {
      URL url = new URL(fileName);
      URLConnection connection = url.openConnection();
      input = connection.getInputStream();
    } else {
      input = new FileInputStream(fileName);
    }
}
}
