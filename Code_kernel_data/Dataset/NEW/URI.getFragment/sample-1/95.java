//95
public class func{
public void resolveRelativeURI(URI base,String rel){
    if (base.getFragment() != null) {
      return base + rel;
    }
    return base.resolve(rel).toString();
}
}
