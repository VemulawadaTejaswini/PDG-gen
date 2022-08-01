//452
public class func{
	public void ssoLogout(){
        URL logoutUrl = createURLFromCasURI(GeoServerCasConstants.LOGOUT_URI);
        HttpURLConnection conn = (HttpURLConnection) logoutUrl.openConnection();
        addCasCookies(conn);
        conn.getInputStream().close();
}
}
