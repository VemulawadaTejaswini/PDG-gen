public class func{
public void valueOf(final java.net.URI uri){
        if( uri.isOpaque()) {
            return new Uri(new Encoded( uri.toString() ), false, 0);
        } else {
            return Uri.create(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                              uri.getPath(), uri.getQuery(), uri.getFragment());
        }
}
}
