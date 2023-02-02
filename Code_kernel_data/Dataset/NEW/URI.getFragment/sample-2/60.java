//60
public class func{
public void changeUserInformation(URI uri,String newUserInformation){
    return create(uri.getScheme(), newUserInformation, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
