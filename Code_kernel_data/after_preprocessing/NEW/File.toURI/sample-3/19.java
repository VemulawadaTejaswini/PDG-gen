//19
public class func{
public void addFile(File f){
      addURL(f.toURI().toURL(), null); // System.err.println(f.toURL());
      System.err.println("MalformedURLException for " + f.getName());
}
}
