//168
public class func{
	public void getResource(String path){
      URL url = new URL("jar:file:" + this.jarPath + "!" + path);
      URLResource resource = new URLResource(url, url.openConnection(), path);
      if (resource.getContentLength() < 0) {
        return null;
      }
}
}
