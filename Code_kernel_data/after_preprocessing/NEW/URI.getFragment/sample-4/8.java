//8
public class func{
public void changeScheme(URI uri,String newScheme){
    return create(newScheme, getCorrectAuthority(uri), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
