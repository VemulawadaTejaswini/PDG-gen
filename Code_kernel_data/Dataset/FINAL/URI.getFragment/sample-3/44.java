public class func{
public void testPrincipalDisplayName(){
    assertTrue(uri.getFragment().endsWith("principal=" + authRequest.getPrincipal().getDisplayName()));
}
}
