//19
public class func{
	public void sendRedirect(String location){
            String redirect = getHeader("location");
                URI redirectURI = new URI(redirect);
                newRedirectURI = new URI(scheme, redirectURI.getUserInfo(),
                        redirectURI.getHost(), port, redirectURI.getPath(),
                        redirectURI.getQuery(), redirectURI.getFragment());
                log.warn(sm.getString("remoteIpFilter.invalidLocation",
                        location, scheme, Integer.toString(port)));
}
}
