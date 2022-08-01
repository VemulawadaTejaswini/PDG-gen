//69
public class func{
	public void addParent(JSONArray parents,String name,URI location,IPath resourcePath,HttpServletRequest request,String tree){
      parent = new JSONObject();
      parent.put(ProtocolConstants.KEY_LOCATION, location);
        childLocation = new URI(location.getScheme(), location.getUserInfo(), location.getHost(), location.getPort(), location.getPath(), "depth=1", location.getFragment()); //$NON-NLS-1$
}
}
