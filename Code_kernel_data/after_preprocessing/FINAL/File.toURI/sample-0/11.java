public class func{
public void normaliseFilePathToUrl(String path){
        if(path.startsWith("file:") 
                || path.startsWith("http:") 
                || path.startsWith("https:")) {
            return new URI(path).toURL();
        } else {
            return new File(path).toURI().toURL();
        }
}
}
