//41
public class func{
public void valueOf(final java.net.URI uri){
        if( uri.isOpaque()) {
            // opaque, without host validation.
            // Note: This may induce encoding errors of authority and path, see {@link #PARSE_HINT_FIX_PATH}
            return new Uri(new Encoded( uri.toString() ), false, 0);
        } else {
            // with host validation if authority is defined
            return Uri.create(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                              uri.getPath(), uri.getQuery(), uri.getFragment());
        }
}
}
