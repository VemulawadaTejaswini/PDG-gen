public class func{
public void canonicalize(String uriString){
                if (u.getFragment() == null) {
                    u = new URI("
                } else {
                    u = new URI("
                                + u.getFragment());
                }
}
}
