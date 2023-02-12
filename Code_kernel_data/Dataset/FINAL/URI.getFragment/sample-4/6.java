public class func{
public void reconstructAuthorityIfNeeded(URI uri,Configuration conf){
              uri.getPath(), uri.getQuery(), uri.getFragment());
          throw new Error("Bad URI construction", e);
}
}
