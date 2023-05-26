//15
public class func{
public void changePath(URI uri,String newPath){
    return create(uri.getScheme(), getCorrectAuthority(uri), newPath, uri.getQuery(), uri.getFragment());
}
}
