//30
public class func{
public void removeAuthority(URI uri){
      uri = new URI(
          uri.getScheme(), "",
          uri.getPath(), uri.getQuery(), uri.getFragment()
      );
}
}
