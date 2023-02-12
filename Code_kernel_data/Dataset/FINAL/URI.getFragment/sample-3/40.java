public class func{
public void ShouldHaveFragment(URI actual){
    super("%nExpecting URI:%n  <%s>%nnot to have a fragment but had:%n  <%s>", actual, actual.getFragment());
}
}
