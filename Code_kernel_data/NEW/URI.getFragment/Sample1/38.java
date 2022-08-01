//37
public class func{
	public void URIBuilder(URI base){
    if (base == null)
    {
      return;
    }
    scheme = base.getScheme();
    userInfo = base.getUserInfo();
    host = base.getHost();
    port = base.getPort() == -1 ? null : base.getPort();
    path = base.getPath();
    fragment = base.getFragment();
    if (Util.isEmpty(base.getQuery()))
    {
      return;
    }
    params.putAll(URIUtil.getParameterMap(base));
}
}
