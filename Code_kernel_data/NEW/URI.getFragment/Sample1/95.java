//94
public class func{
	public void getMRFrameworkName(Configuration conf){
      frameworkName = uri.getFragment();
      if (frameworkName == null) {
        frameworkName = new Path(uri).getName();
      }
}
}
