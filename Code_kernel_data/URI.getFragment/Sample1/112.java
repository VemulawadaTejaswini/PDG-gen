//111
public class func{
	public void checkNoFragment(URI address){
    String fragment = address.getFragment();
    if (fragment != null && fragment.length() > 0) {
      throw new IllegalAddressException(
          address, IllegalAddressException.Reason.FRAGMENT_UNSUPPORTED, null);
    }
}
}
