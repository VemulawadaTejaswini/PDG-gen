//105
public class func{
public void createFileResource(String path){
          File f = new File(path);
          URI uri = f.toURI();
          URL url = uri.toURL();
            return new FileResource(url);
}
}
