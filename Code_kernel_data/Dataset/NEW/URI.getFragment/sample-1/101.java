//101
public class func{
public void smbUri2unc(final URI uri){
    final String fragment = uri.getFragment();
    if(fragment != null)
      uriString = uriString + '#' + fragment;
}
}
