//10
public class func{
	public void show(URI u){
        show("opaque", "" + u.isOpaque());
        show("scheme", u.getScheme());
        show("ssp", u.getRawSchemeSpecificPart(), u.getSchemeSpecificPart());
        show("authority", u.getRawAuthority(), u.getAuthority());
        show("userinfo", u.getRawUserInfo(), u.getUserInfo());
        show("host", u.getHost());
        show("port", "" + u.getPort());
        show("path", u.getRawPath(), u.getPath());
        show("query", u.getRawQuery(), u.getQuery());
        show("fragment", u.getRawFragment(), u.getFragment());
        if (!u.toString().equals(u.toASCIIString()))
            show("toascii", u.toASCIIString());
}
}
