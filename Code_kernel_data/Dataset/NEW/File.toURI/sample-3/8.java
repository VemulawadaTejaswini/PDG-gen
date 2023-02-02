//8
public class func{
public void toUrl(String src){
      File f = (new FileProvider()).getFileFromClassLoader(src, this.getClass().getClassLoader());
      URL url = f.toURI().toURL();
}
}
