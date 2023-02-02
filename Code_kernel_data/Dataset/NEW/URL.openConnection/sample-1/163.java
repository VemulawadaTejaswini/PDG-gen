//163
public class func{
public void openConnection(URL url){
      String name = url.getPath().substring(
          ExplodedArchive.this.root.toURI().getPath().length());
      if (ExplodedArchive.this.entries.containsKey(new AsciiBytes(name))) {
        return new URL(url.toString()).openConnection();
      }
      return new FileNotFoundURLConnection(url, name);
}
}
