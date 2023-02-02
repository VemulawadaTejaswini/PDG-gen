//5
public class func{
public void normalize(URI uri){
                uri.getPath(), uri.getQuery(), uri.getFragment());
            throw new IOException("Failed to normalize URI: " + uri, e);
}
}
