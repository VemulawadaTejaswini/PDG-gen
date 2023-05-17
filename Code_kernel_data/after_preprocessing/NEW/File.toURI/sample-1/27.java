//27
public class func{
public void asClickableFileUrl(File path){
      return new URI("file", "", path.toURI().getPath(), null, null).toString();
}
}
