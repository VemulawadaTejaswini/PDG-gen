//89
public class func{
public void appendPathToUri(URI baseUri,String path,String pathSeparator){
    return new URI(baseUri.getScheme(), baseUri.getAuthority(),
        stringbuilder.toString(), baseUri.getQuery(),
        baseUri.getFragment());
}
}
