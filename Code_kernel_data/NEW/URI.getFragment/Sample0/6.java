//5
public class func{
	public void handleRedirect(UpgradeResponse upgradeResponse){
            listener.onError(new RedirectException(upgradeResponse.getStatus(), LocalizationMessages
                    .HANDSHAKE_HTTP_REDIRECTION_NOT_ENABLED(upgradeResponse.getStatus())));
        final List<String> locationHeader = upgradeResponse.getHeaders().get(UpgradeResponse.LOCATION);
        if (locationHeader != null) {
            locationString = Utils.getHeaderFromList(locationHeader);
        }
        if (locationString == null || locationString.equals("")) {
            listener.onError(new RedirectException(upgradeResponse.getStatus(), LocalizationMessages
                    .HANDSHAKE_HTTP_REDIRECTION_NEW_LOCATION_MISSING()));
            clientEngineState = TyrusClientEngineState.FAILED;
            return UPGRADE_INFO_FAILED;
        }
            location = new URI(locationString);
            String scheme = location.getScheme();
            if ("http".equalsIgnoreCase(scheme)) {
                scheme = "ws";
            }
            if ("https".equalsIgnoreCase(scheme)) {
                scheme = "wss";
            }
            int port = Utils.getWsPort(location, scheme);
            location = new URI(scheme, location.getUserInfo(), location.getHost(), port, location
                    .getPath(), location.getQuery(), location.getFragment());
            if (!location.isAbsolute()) {
                // location is not absolute, we need to resolve it.
                URI baseUri = redirectLocation == null ? connectToServerUriParam : redirectLocation;
                location = baseUri.resolve(location.normalize());

                if (LOGGER.isLoggable(Level.FINEST)) {
                    LOGGER.finest("HTTP Redirect - Base URI for resolving target location: " + baseUri);
                    LOGGER.finest("HTTP Redirect - Location URI header: " + locationString);
                    LOGGER.finest("HTTP Redirect - Normalized and resolved Location URI header "
                                          + "against base URI: " + location);
                }
            }
}
}
