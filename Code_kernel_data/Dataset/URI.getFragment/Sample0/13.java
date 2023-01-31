//12
public class func{
	public void NetconfProtocolSession(ProtocolSessionContext protocolSessionContext,String sessionID){
      if (authentication.equals(SessionContext.AuthType.PASSWORD)) {
        context.setAuthenticationType(SessionContext.AuthType.PASSWORD);

        // store username and password in the uri, as required by netconf4j
        String userName = (String) protocolSessionContext.getSessionParameters().get(ProtocolSessionContext.USERNAME);
        String password = (String) protocolSessionContext.getSessionParameters().get(ProtocolSessionContext.PASSWORD);

        String userInfo = userName + ":" + password;
        URI uri1 = new URI(uri);
        URI uri2 = new URI(uri1.getScheme(),
            userInfo, uri1.getHost(), uri1.getPort(),
            uri1.getPath(), uri1.getQuery(),
            uri1.getFragment());

        context.setURI(uri2);
      }

      else if (authentication.equals(SessionContext.AuthType.PUBLICKEY)) {

        String keyURI = (String) protocolSessionContext.getSessionParameters().get(ProtocolSessionContext.KEY_PATH);
        if ((keyURI == null) || (keyURI.length() == 0)) {
          throw new ProtocolException(
              "Mantychore protocols NETCONF: Couldn't get " + ProtocolSessionContext.AUTH_TYPE + "from protocolSessionContext.");
        }

        context.setKeyUsername((String) protocolSessionContext.getSessionParameters().get(ProtocolSessionContext.KEY_USERNAME));
        context.setKeyPassword((String) protocolSessionContext.getSessionParameters().get(ProtocolSessionContext.KEY_PASSPHRASE));
        context.setKeyLocation((String) protocolSessionContext.getSessionParameters().get(ProtocolSessionContext.KEY_PATH));
        context.setAuthenticationType(SessionContext.AuthType.PUBLICKEY);

      } else {
        throw new ProtocolException("Authentication Error: Invalid authentication type.");
      }
      netconfSession = new NetconfSession(context);
}
}
