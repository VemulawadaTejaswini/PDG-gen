public class func{
public void extractFragment(URI address){
    String frag = address.getFragment();
    if (frag == null || frag.length() == 0) {
      throw new IllegalAddressException(
          address, IllegalAddressException.Reason.MISSING_FRAGMENT, null);
    }
}
}
