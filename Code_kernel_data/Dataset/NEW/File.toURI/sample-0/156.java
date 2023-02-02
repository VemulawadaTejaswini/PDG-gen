//156
public class func{
public void extendPath(URI base,String child){
    return new File(URIUtils.getAbsoluteFile(base), child).toURI();
}
}
