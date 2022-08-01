//110
public class func{
	public void getPathWithFragment(URI uri){
    String path = uri.getPath();
    String fragment = uri.getFragment();
    if (StringUtils.hasText(fragment)) {
      path = path + "#" + fragment;
    }
}
}
