//7
public class func{
public void toUrl(String src){
      File f = (new FileProvider()).getFileFromClassLoader(src, HTMLCGBuilder.class.getClassLoader());
      URL url = f.toURI().toURL();
}
}
