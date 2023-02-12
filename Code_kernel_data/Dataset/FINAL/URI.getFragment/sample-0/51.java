public class func{
public void initialize(URI name,Configuration conf){
      URI realUri = new URI (realScheme, realAuthority,
                            name.getPath(), name.getQuery(), name.getFragment());
}
}
