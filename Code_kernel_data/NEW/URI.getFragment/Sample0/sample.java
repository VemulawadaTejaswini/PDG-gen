//0
public class func{
	public void setPath(final URI initialUri,final String path){
            if (initialUri.getHost() == null && initialUri.getAuthority() != null) {
                return new URI(initialUri.getScheme(), initialUri.getAuthority(), finalPath, initialUri.getQuery(),
                        initialUri.getFragment());
            } else {
                return new URI(initialUri.getScheme(), initialUri.getUserInfo(), initialUri.getHost(), initialUri.getPort(),
                        finalPath, initialUri.getQuery(), initialUri.getFragment());
            }
}
}
//1
public class func{
	public void test_equals2(){
        URI uri = new URI("http:///~/dictionary");
        URI uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(),
                uri.getQuery(), uri.getFragment());
        assertTrue(uri2.equals(uri));
        uri = new URI("http://abc.com%E2%82%AC:88/root/news");
}
}
//2
public class func{
	public void defaultRemoteUrl(){
        final String sanitizedUrl = sanitizeUrl();
            URI uri = new URI(sanitizedUrl);
            if (uri.getUserInfo() != null) {
                uri = new URI(uri.getScheme(), removePassword(uri.getUserInfo()), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                return uri.toString();
            }
}
}
//3
public class func{
	public void main(String[] args){
    System.out.println(new URI(FILE_URI).getAuthority());
    System.out.println(new URI(FILE_URI).getFragment());
    System.out.println(new URI(FILE_URI).getHost());
    System.out.println(new URI(FILE_URI).getPath());
    System.out.println(new URI(FILE_URI).getPort());
    System.out.println(new URI(FILE_URI).getScheme());
    System.out.println(new URI(FILE_URI).getSchemeSpecificPart());
    System.out.println(new URI(FILE_URI).getUserInfo());
}
}
//4
public class func{
	public void testGetUnknownRemote(){
    createWorkspace(SimpleMetaStore.DEFAULT_WORKSPACE_NAME);
    String workspaceId = workspaceIdFromLocation(workspaceLocation);
    JSONObject project = createProjectOrLink(workspaceLocation, getMethodName().concat("Project"), null);
    IPath clonePath = getClonePath(workspaceId, project);
    clone(clonePath);
    WebRequest request = getGetRequest(project.getString(ProtocolConstants.KEY_CONTENT_LOCATION));
    WebResponse response = webConversation.getResponse(request);
    assertEquals(HttpURLConnection.HTTP_OK, response.getResponseCode());
    project = new JSONObject(response.getText());
    JSONObject gitSection = project.optJSONObject(GitConstants.KEY_GIT);
    assertNotNull(gitSection);
    String gitRemoteUri = gitSection.getString(GitConstants.KEY_REMOTE);
    request = getGetGitRemoteRequest(gitRemoteUri);
    response = webConversation.getResponse(request);
    assertEquals(HttpURLConnection.HTTP_OK, response.getResponseCode());
    JSONObject remotes = new JSONObject(response.getText());
    JSONArray remotesArray = remotes.getJSONArray(ProtocolConstants.KEY_CHILDREN);
    assertEquals(1, remotesArray.length());
    JSONObject remote = remotesArray.getJSONObject(0);
    assertNotNull(remote);
    String remoteLocation = remote.getString(ProtocolConstants.KEY_LOCATION);
    assertNotNull(remoteLocation);
    URI u = URI.create(toRelativeURI(remoteLocation));
    IPath p = new Path(u.getPath());
    p = p.uptoSegment(2).append("xxx").append(p.removeFirstSegments(3));
    URI nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), p.toString(), u.getQuery(), u.getFragment());
    request = getGetGitRemoteRequest(nu.toString());
    response = webConversation.getResponse(request);
    ServerStatus status = waitForTask(response);
    assertEquals(status.toString(), status.getHttpCode(), HttpURLConnection.HTTP_NOT_FOUND);
    p = new Path(u.getPath());
    p = p.uptoSegment(3).append("xxx").append(p.removeFirstSegments(3));
    nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), p.toString(), u.getQuery(), u.getFragment());
    request = getGetGitRemoteRequest(nu.toString());
    response = webConversation.getResponse(request);
    assertEquals(HttpURLConnection.HTTP_NOT_FOUND, response.getResponseCode());
}
}
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
//6
public class func{
	public void findCredentials(URI target){
        T creds = this.getCredentials(target);
            while (creds == null) {
                if (target.getFragment() != null) {
                    // If it has a fragment strip that off
                    target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(),
                            target.getPath(), target.getQuery(), null);
                } else if (target.getQuery() != null) {
                    // If it has a query string strip that off
                    target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(),
                            target.getPath(), null, null);
                } else if (target.getPath() != null) {
                    // Try and strip off last segment of the path
                    String currPath = target.getPath();
                    if (currPath.endsWith("/")) {
                        currPath = currPath.substring(0, currPath.length() - 1);
                        if (currPath.length() == 0)
                            currPath = null;
                        target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(), currPath,
                                null, null);
                    } else if (currPath.contains("/")) {
                        currPath = currPath.substring(0, currPath.lastIndexOf('/') + 1);
                        if (currPath.length() == 0)
                            currPath = null;
                        target = new URI(target.getScheme(), target.getUserInfo(), target.getHost(), target.getPort(), currPath,
                                null, null);
                    } else {
                        // If path is non-null it must always contain a /
                        // otherwise it would be an invalid path
                        // In this case bail out
                        return null;
                    }
                }

                creds = this.getCredentials(target);
            }
}
}
//7
public class func{
	public void stripLastComponent(String input){
            URI uri = new URI(input);
            if (uri.getFragment() != null) {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(),
                        null).toString();
            } else if (uri.getQuery() != null) {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), null, null)
                        .toString();
            } else if (uri.getPath() != null) {
                // Try and strip off last segment of the path
                String currPath = uri.getPath();
                if (currPath.endsWith("/")) {
                    currPath = currPath.substring(0, currPath.length() - 1);
                    if (currPath.length() == 0)
                        currPath = null;
                    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), currPath, null, null)
                            .toString();
                } else if (currPath.contains("/")) {
                    currPath = currPath.substring(0, currPath.lastIndexOf('/') + 1);
                    if (currPath.length() == 0)
                        currPath = null;
                    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), currPath, null, null)
                            .toString();
                } else {
                    // If path is non-null it must always contain a /
                    // otherwise it would be an invalid path
                    // In this case there are no further components to strip
                    return null;
                }
            } else {
                // No further components to strip
                return null;
            }
}
}
//8
public class func{
	public void test_ConstructorLjava_lang_StringLjava_lang_StringLjava_lang_String(){
        URI uri = new URI("mailto", "mduerst@ifi.unizh.ch", null);
        assertNull("wrong userinfo", uri.getUserInfo());
        assertNull("wrong hostname", uri.getHost());
        assertNull("wrong authority", uri.getAuthority());
        assertEquals("wrong port number", -1, uri.getPort());
        assertNull("wrong path", uri.getPath());
        assertNull("wrong query", uri.getQuery());
        assertNull("wrong fragment", uri.getFragment());
        assertEquals("wrong SchemeSpecificPart", "mduerst@ifi.unizh.ch", uri
                .getSchemeSpecificPart());
            uri = new URI("mailto", null, null);
            uri = new URI("3scheme", "//authority/path", "fragment");
            uri = new URI("", "//authority/path", "fragment");
}
}
//9
public class func{
	public void testContextualizeUrl(){
    URI tmp = new URI("http://base.com/foo.html#REF");
    String ref = tmp.getFragment();
    assertEquals("REF",ref);
    tmp = new URI("http://base.com/foo.html");
    assertNull(tmp.getFragment());
}
}
//10
public class func{
	public void createServiceInfo(Map<String,Object> serviceData){
      URI uri = new URI((String)credentials.get("url"));
      String scheme = uri.getScheme();
      int port = uri.getPort();
      String host = uri.getHost();
      String path = uri.getPath();
      String query = uri.getQuery();
      String fragment = uri.getFragment();
      String url = new URI(scheme, "", host, port, path, query, fragment).toString();
}
}
//11
public class func{
	public void alterTable(RawStore msdb,Warehouse wh,String dbname,String name,Table newt){
      if (!newt.getTableName().equalsIgnoreCase(name)
          || !newt.getDbName().equalsIgnoreCase(dbname)) {
        if (msdb.getTable(newt.getDbName(), newt.getTableName()) != null) {
          throw new InvalidOperationException("new table " + newt.getDbName()
              + "." + newt.getTableName() + " already exists");
        }
        rename = true;
      }
      Table oldt = msdb.getTable(dbname, name);
      if (oldt == null) {
        throw new InvalidOperationException("table " + newt.getDbName() + "."
            + newt.getTableName() + " doesn't exist");
      }
      if (oldt.getPartitionKeys().size() != newt.getPartitionKeys().size()
          || !oldt.getPartitionKeys().containsAll(newt.getPartitionKeys())) {
        throw new InvalidOperationException(
            "partition keys can not be changed.");
      }
      if (rename
          && (oldt.getSd().getLocation().compareTo(newt.getSd().getLocation()) == 0
            || StringUtils.isEmpty(newt.getSd().getLocation()))
          && !MetaStoreUtils.isExternalTable(oldt)) {
        // that means user is asking metastore to move data to new location
        // corresponding to the new name
        // get new location
        newTblLoc = wh.getDefaultTablePath(newt.getDbName(), newt.getTableName()).toString();
        newt.getSd().setLocation(newTblLoc);
        oldTblLoc = oldt.getSd().getLocation();
        moveData = true;
        // check that destination does not exist otherwise we will be
        // overwriting data
        srcPath = new Path(oldTblLoc);
        srcFs = wh.getFs(srcPath);
        destPath = new Path(newTblLoc);
        destFs = wh.getFs(destPath);
        // check that src and dest are on the same file system
        if (srcFs != destFs) {
          throw new InvalidOperationException("table new location " + destPath
              + " is on a different file system than the old location "
              + srcPath + ". This operation is not supported");
        }
        try {
          srcFs.exists(srcPath); // check that src exists and also checks
                                 // permissions necessary
          if (destFs.exists(destPath)) {
            throw new InvalidOperationException("New location for this table "
                + newt.getDbName() + "." + newt.getTableName()
                + " already exists : " + destPath);
          }
        } catch (IOException e) {
          Warehouse.closeFs(srcFs);
          Warehouse.closeFs(destFs);
          throw new InvalidOperationException("Unable to access new location "
              + destPath + " for table " + newt.getDbName() + "."
              + newt.getTableName());
        }
        // also the location field in partition
        List<Partition> parts = msdb.getPartitions(dbname, name, 0);
        for (Partition part : parts) {
          String oldPartLoc = part.getSd().getLocation();
          String oldTblLocPath = new Path(oldTblLoc).toUri().getPath();
          String newTblLocPath = new Path(newTblLoc).toUri().getPath();
          if (oldPartLoc.contains(oldTblLocPath)) {
            URI newPartLocUri = null;
            try {
              URI oldPartLocUri = new URI(oldPartLoc);
              newPartLocUri = new URI(
                  oldPartLocUri.getScheme(),
                  oldPartLocUri.getUserInfo(),
                  oldPartLocUri.getHost(),
                  oldPartLocUri.getPort(),
                  oldPartLocUri.getPath().replace(oldTblLocPath, newTblLocPath),
                  oldPartLocUri.getQuery(),
                  oldPartLocUri.getFragment());
            } catch (URISyntaxException e) {
              throw new InvalidOperationException("Old partition location " +
                  " is invalid. (" + oldPartLoc + ")");
            }
            part.getSd().setLocation(newPartLocUri.toString());
            msdb.alterPartition(dbname, name, part);
          }
        }
      }
      msdb.alterTable(dbname, name, newt);
      success = msdb.commitTransaction();
}
}
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
//13
public class func{
	public void forDisplay(){
            URI uri = new URI(sanitizeUrl());
            if (uri.getUserInfo() != null) {
                //(String scheme, String userInfo, String host, int port, String path, String query, String fragment)
                uri = new URI(uri.getScheme(), clean(uri.getUserInfo()), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            return uriToDisplay(uri);
}
}
//14
public class func{
	public void rewriteUrlIfNeeded(String value){
            if (value.startsWith(this.serverProto.concat("://")))
            {
  
                uri = new URI (value);
            }
            else
            {
                URL url = new URL(this.requestURL, value);
                uri = url.toURI();
            }
            String actualProto = uri.getScheme();
            if (!this.serverProto.equalsIgnoreCase(actualProto))
            {
                // protocol is already correct
                return null;
            }
            if (!this.serverName.equals(uri.getHost()))
            {
                // going to a different host
                return null;
            }
            if (normalizePort(this.serverProto, this.serverPort) != normalizePort(actualProto, uri.getPort()))
            {
                // not to default port
                return null;
            }
            return new URI(this.clientProto,null, this.serverName, this.clientPort, uri.getPath(),uri.getQuery(),uri.getFragment()).toURL();
}
}
//15
public class func{
	public void parseURI(String original,boolean mustBePath){
                idxColon = original.indexOf(':');
            if (idxColon != -1) {
                // colon present
                if ((idxSlash != -1) && idxSlash < idxColon)     // There's a slash, and it's before the colon â�� everything OK
                    ;
                else    // No slash before the colon; we have to put it there
                    original = "./" + original;
            }
        String repaired = original
                .replaceAll(" ", "%20")
                .replaceAll("\\{", "%7B")
                .replaceAll("\\}", "%7D");
        if (!repaired.equals(original))
            Log.w(TAG, "Repaired invalid URL: " + original + " -> " + repaired);
    URI uri = new URI(repaired);
    URI normalized = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment());
    Log.v(TAG, "Normalized URI " + original + " -> " + normalized.toASCIIString() + " assuming that it was " +
                (mustBePath ? "a path name" : "an URI or path name"));
}
}
//16
public class func{
	public void makeURI(final String s){
        URI uri = new URI(s);
        if (uri.getScheme() == null) {
            uri = new URI("file", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        }
}
}
//17
public class func{
	public void decodeHarURI(URI rawURI,Configuration conf){
      URI baseUri = new URI(authority.replaceFirst("-", "://"));
      tmp = new URI(baseUri.getScheme(), baseUri.getAuthority(),
            rawURI.getPath(), rawURI.getQuery(), rawURI.getFragment());
      throw new IOException("URI: " + rawURI
          + " is an invalid Har URI. Expecting har://<scheme>-<host>/<path>.");
}
}
//18
public class func{
	public void testAsynch(){
         URI uri = new URI(request.getUri());
         String query = (uri.getQuery() == null ? "" : "&") + "wait=1000";
         URI newURI = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment());
         request = new ClientRequest(newURI.toString());
         response = request.get();
         Assert.assertEquals(HttpServletResponse.SC_OK, response.getStatus());
         Assert.assertEquals(response.getEntity(String.class), "content");
         response = request.get();
         Assert.assertEquals(HttpServletResponse.SC_OK, response.getStatus());
         Assert.assertEquals(response.getEntity(String.class), "content");
         request = new ClientRequest(jobUrl);
         response = request.delete();
         Assert.assertEquals(HttpServletResponse.SC_NO_CONTENT, response.getStatus());
         response = request.get();
         Assert.assertEquals(HttpServletResponse.SC_GONE, response.getStatus());
         response.releaseConnection();
}
}
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
//20
public class func{
	public void updateQuery(String uriString,String query){
         URI uri = new URI(uriString);
         return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment()).toString();
}
}
//21
public class func{
	public void loadFromUri(URI uri,URI base,Object validator){
        if (base != null) {
            fullUri = base.resolve(uri);
        }
        if (!fullUri.getSchemeSpecificPart().endsWith(SUFFIX)) {            
            fullUri =
                new URI(fullUri.getScheme(), fullUri.getAuthority(), fullUri.getPath() + SUFFIX, fullUri.getQuery(),
                    fullUri.getFragment());
        }
        Reader sourceReader = scriptSourceProvider.getScriptSource(fullUri);
        if (sourceReader == null) {
            return null;
        } else {
            return new ModuleSource(sourceReader, null, uri, base, validator);
        }
}
}
//22
public class func{
	public void resolveHostNameInUrl(DatacenterMO dcMo,String url){
          URI resolvedUri = new URI(uri.getScheme(), uri.getUserInfo(), hostIp, uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
          s_logger.info("url " + url + " is resolved to " + resolvedUri.toString() + " through vCenter");
          return resolvedUri.toString();
}
}
//23
public class func{
	public void intParseURL(String str){
        URI uri = new URI(str);
        if (uri.isOpaque()) {
            throw new MalformedURLException(
                "not a hierarchical URL: " + str);
        }
        if (uri.getFragment() != null) {
            throw new MalformedURLException(
                "invalid character, '#', in URL name: " + str);
        } else if (uri.getQuery() != null) {
            throw new MalformedURLException(
                "invalid character, '?', in URL name: " + str);
        } else if (uri.getUserInfo() != null) {
            throw new MalformedURLException(
                "invalid character, '@', in URL host: " + str);
        }
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.equals("rmi")) {
            throw new MalformedURLException("invalid URL scheme: " + str);
        }
        String name = uri.getPath();
        if (name != null) {
            if (name.startsWith("/")) {
                name = name.substring(1);
            }
            if (name.length() == 0) {
                name = null;
            }
        }
        String host = uri.getHost();
        if (host == null) {
            host = "";
            try {
                /*
                 * With 2396 URI handling, forms such as 'rmi://host:bar'
                 * or 'rmi://:<port>' are parsed into a registry based
                 * authority. We only want to allow server based naming
                 * authorities.
                 */
                uri.parseServerAuthority();
            } catch (URISyntaxException use) {
                // Check if the authority is of form ':<port>'
                String authority = uri.getAuthority();
                if (authority != null && authority.startsWith(":")) {
                    // Convert the authority to 'localhost:<port>' form
                    authority = "localhost" + authority;
                    try {
                        uri = new URI(null, authority, null, null, null);
                        // Make sure it now parses to a valid server based
                        // naming authority
                        uri.parseServerAuthority();
                    } catch (URISyntaxException use2) {
                        throw new
                            MalformedURLException("invalid authority: " + str);
                    }
                } else {
                    throw new
                        MalformedURLException("invalid authority: " + str);
                }
            }
        }
        int port = uri.getPort();
        if (port == -1) {
            port = Registry.REGISTRY_PORT;
        }
        return new ParsedNamingURL(host, port, name);
}
}
//24
public class func{
	public void launch(final ILaunchConfiguration config,String mode,final ILaunch launch,IProgressMonitor m){
                    exeURI = new URI(exeURI.getScheme(), exeURI.getAuthority(), newExePath.toString(), exeURI.getQuery(), exeURI.getFragment());
                    exeFS = exeRFP.getResource(exeURI.getPath());
}
}
//25
public class func{
	public void processURI(String u,String overrideType,boolean forBaseHref,boolean inline){
    String host = uri.getHost();
    if(host != null && (host.equals("localhost") || host.equals("127.0.0.1")) && uri.getPort() == 8888) {
      try {
        uri = new URI(null, null, null, -1, uri.getPath(), uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        Logger.error(this, "URI "+uri+" looked like localhost but could not parse", e);
        throw new CommentException("URI looked like localhost but could not parse: "+e);
      }
      host = null;
    }
    String rpath = uri.getPath();
}
}
//26
public class func{
	public void doGetScriptSource(URI scriptUri){
        URI remoteUri = remoteClient.getRemoteURI().resolve(URL_PATH_PREFIX + path);
        String replacementScheme = SecurityUtil.isTransportSecure(remoteUri.getScheme()) ? "https" : "http";
            remoteUri = new URI(replacementScheme, remoteUri.getAuthority(), remoteUri.getPath(), remoteUri.getQuery(), remoteUri.getFragment());
            LOG.error("Failed to copy the RHQ server download URI: " + remoteUri + " to the " + replacementScheme + " scheme.");
            URL downloadUrl = remoteUri.toURL();
            return new InputStreamReader(downloadUrl.openStream());
            LOG.debug("Failed to download the script from the RHQ server using URL: " + remoteUri, e);
            LOG.debug("Failed to download the script from the RHQ server using URL: " + remoteUri, e);
}
}
//27
public class func{
	public void rewriteURI(HttpServletRequest request){
                String rewrittenPath = rewrittenURI.getPath();
                if (rewrittenPath != null
                        && (len = rewrittenPath.length()) > 1
                        && rewrittenPath.endsWith("/"))
                {
                    rewrittenPath = rewrittenPath.substring(0, len - 1);

                    try
                    {
                        rewrittenURI
                            = new URI(
                                    rewrittenURI.getScheme(),
                                    rewrittenURI.getAuthority(),
                                    rewrittenPath,
                                    rewrittenURI.getQuery(),
                                    rewrittenURI.getFragment());
                    }
                    catch (URISyntaxException urise)
                    {
                    }
                }
}
}
//28
public class func{
	public void resovleOrionURI(HttpServletRequest request,URI uri){
    if (!uri.getScheme().equals("orion"))
      return uri;
      return new URI(null, null, request.getContextPath() + uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//29
public class func{
	public void updatePortAndScheme(final URI uri){
        int port = uri.getPort();
        if (UseHttpForHttpsProcessor.this.portMapping.containsKey(port)) {
            port = UseHttpForHttpsProcessor.this.portMapping.get(port);
        }
        httpUri = new URI("http", uri.getUserInfo(), uri.getHost(), port,
                uri.getPath(),
                uri.getQuery(), uri.getFragment());
}
}
//30
public class func{
	public void removeAuthority(URI uri){
      uri = new URI(
          uri.getScheme(), "",
          uri.getPath(), uri.getQuery(), uri.getFragment()
      );
}
}
//31
public class func{
	public void createEndpoint(String uri,String remaining,Map<String,Object> parameters){
        endpointUri = URISupport.createRemainingURI(
                new URI(scheme,
                        endpointUri.getUserInfo(),
                        endpointUri.getHost(),
                        endpointUri.getPort(),
                        endpointUri.getPath(),
                        endpointUri.getQuery(),
                        endpointUri.getFragment()),
                httpClientParameters);
        String endpointUriString = endpointUri.toString();
        LOG.debug("Creating endpoint uri {}", endpointUriString);
}
}
//32
public class func{
	public void getProxyUri(URI wsUri,String scheme){
            return new URI(scheme, wsUri.getUserInfo(), wsUri.getHost(), wsUri.getPort(), wsUri.getPath(),
                           wsUri.getQuery(), wsUri.getFragment());
            LOGGER.log(Level.WARNING, String.format("Exception during generating proxy URI '%s'", wsUri), e);
}
}
//33
public class func{
	public void getLibraryURL(){
    String property = defaultProperties.getProperty( CASCADING_SERVICES_JAR );
    if( property == null )
      return null;
      URI uri = URI.create( property );
      if( !uri.isAbsolute() )
        uri = new URI( "file", uri.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment() );
      return uri.toURL();
}
}
//34
public class func{
	public void connect(final ClientCallback<ClientConnection> listener,final InetSocketAddress bindAddress,final URI uri,final XnioIoThread ioThread,final XnioSsl ssl,final Pool<ByteBuffer> bufferPool,final OptionMap options){
            upgradeUri = new URI("http", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//35
public class func{
	public void getProxyUri(URI wsUri,String scheme){
            return new URI(scheme, wsUri.getUserInfo(), wsUri.getHost(), wsUri.getPort(), wsUri.getPath(),
                           wsUri.getQuery(), wsUri.getFragment());
            LOGGER.log(Level.WARNING, String.format("Exception during generating proxy URI '%s'", wsUri), e);
}
}
//36
public class func{
	public void changeScheme(final URI bindAddr,final String scheme){
        return new URI(scheme, bindAddr.getUserInfo(), bindAddr.getHost(), bindAddr.getPort(), bindAddr.getPath(), bindAddr.getQuery(), bindAddr.getFragment());
}
}
//37
public class func{
	public void connect(final Context context,String path,int maxLength,final WebSocketHandler<T> handler){
    PublicAddress publicAddress = context.get(PublicAddress.class);
    URI address = publicAddress.getAddress(context);
    URI httpPath = address.resolve(path);
      wsPath = new URI("ws", httpPath.getUserInfo(), httpPath.getHost(), httpPath.getPort(), httpPath.getPath(), httpPath.getQuery(), httpPath.getFragment());
}
}
//38
public class func{
	public void enableSynchronization(URI uri){
    return new URI(scheme, uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//39
public class func{
	public void readerToHTTP(URI uri){
      return new URI(scheme, uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//40
public class func{
	public void changeScheme(URI bindAddr,String scheme){
        return new URI(scheme, bindAddr.getUserInfo(), bindAddr.getHost(), bindAddr.getPort(), bindAddr
            .getPath(), bindAddr.getQuery(), bindAddr.getFragment());
}
}
//41
public class func{
	public void connect(final ClientCallback<ClientConnection> listener,InetSocketAddress bindAddress,final URI uri,final XnioWorker worker,final XnioSsl ssl,final Pool<ByteBuffer> bufferPool,final OptionMap options){
            upgradeUri = new URI("http", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//42
public class func{
	public void updatePortAndSchemeInAuthority(final URI uri){
        Matcher matcher = HTTP_AUTHORITY_PORT_EXTRACTOR.matcher(uri.getAuthority());
        if (matcher.matches()) {
            int port = Integer.parseInt(matcher.group(2));
            authority = authority.substring(0, matcher.start(2));

            if (UseHttpForHttpsProcessor.this.portMapping.containsKey(port)) {
                port = UseHttpForHttpsProcessor.this.portMapping.get(port);
            }

            authority = authority + port;
        }
        httpUri = new URI("http", authority, uri.getPath(), uri.getQuery(),
                uri.getFragment());
}
}
//43
public class func{
	public void identifyNewDiffResource(HttpServletRequest request,HttpServletResponse response){
      for (int i = 0; i < p.segmentCount(); i++) {
        String s = p.segment(i);
        if (i == 2) {
          s += ".."; //$NON-NLS-1$
          s += GitUtils.encode(requestObject.getString(GitConstants.KEY_COMMIT_NEW));
        }
        np = np.append(s);
      }
      if (p.hasTrailingSeparator())
        np = np.addTrailingSeparator();
      URI nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), np.toString(), u.getQuery(), u.getFragment());
}
}
//44
public class func{
	public void handlePost(HttpServletRequest request,HttpServletResponse response,String pathString){
      if (cloneName == null)
        cloneName = filePath.segmentCount() > 2 ? filePath.lastSegment() : project.getFullName();
    } else if (workspacePath != null) {
      IPath path = new Path(workspacePath);
      // TODO: move this to CloneJob
      // if so, modify init part to create a new project if necessary
      final IMetaStore metaStore = OrionConfiguration.getMetaStore();
      WorkspaceInfo workspace = metaStore.readWorkspace(path.segment(1));
      if (cloneName == null)
        cloneName = new URIish(url).getHumanishName();
      cloneName = getUniqueProjectName(workspace, cloneName);
      webProjectExists = false;
      project = new ProjectInfo();
      project.setFullName(cloneName);
      project.setWorkspaceId(workspace.getUniqueId());

      try {
        // creating project in the backing store will assign a project id
        metaStore.createProject(project);
      } catch (CoreException e) {
        return statusHandler.handleRequest(request, response, new ServerStatus(IStatus.ERROR, HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
            "Error persisting project state", e));
      }
      try {
        WorkspaceResourceHandler.computeProjectLocation(request, project, null, false);
        metaStore.updateProject(project);
      } catch (CoreException e) {
        // delete the project so we don't end up with a project in a bad location
        try {
          metaStore.deleteProject(workspace.getUniqueId(), project.getFullName());
        } catch (CoreException e1) {
          // swallow secondary error
          LogHelper.log(e1);
        }
        // we are unable to write in the platform location!
        String msg = NLS.bind("Failed to create project: {0}", project.getFullName());
        return statusHandler.handleRequest(request, response, new ServerStatus(IStatus.ERROR, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, msg, e));
      }

      URI baseLocation = getURI(request);
      baseLocation = new URI(baseLocation.getScheme(), baseLocation.getUserInfo(), baseLocation.getHost(), baseLocation.getPort(), workspacePath,
          baseLocation.getQuery(), baseLocation.getFragment());
      clone.setId(GitUtils.pathFromProject(workspace, project).toString());
      clone.setContentLocation(project.getProjectStore().toURI());
    }
    clone.setName(cloneName);
    clone.setBaseLocation(getURI(request));
    JSONObject cloneObject = clone.toJSON();
    String cloneLocation = cloneObject.getString(ProtocolConstants.KEY_LOCATION);
}
}
//45
public class func{
	public void findBaseLocationURI(URI fileURI,String relativeFileName){
      if (lastSegment.length() > 0 && !lastSegment.equals(".")) { //$NON-NLS-1$
        if (lastSegment.equals("..")) { //$NON-NLS-1$
          // navigating ".." in the other direction is ambiguous, bailing out
          return null;
        } else {
          if (path.endsWith("/" + lastSegment)) { //$NON-NLS-1$
            int pos = path.lastIndexOf("/" + lastSegment); //$NON-NLS-1$
            path = path.substring(0, pos);
            continue;
          } else {
            // ouch, relativeFileName does not match fileURI, bailing out
            return null;
          }
        }
      }
      cwdURI = new URI(fileURI.getScheme(), fileURI.getUserInfo(), fileURI.getHost(),
          fileURI.getPort(), path + '/', fileURI.getQuery(), fileURI.getFragment());
}
}
//46
public class func{
	public void toPortableUrl(final URI url){
    if (isDynamic(url)) {
      String path = url.getPath();
      if (path != null && path.startsWith("/rhelp")) {
        path = path.substring(6);
      }
      return new URI(PORTABLE_URL_SCHEME, null, null, -1,
          path, url.getQuery(), url.getFragment());
    }
}
}
//47
public class func{
	public void normalizeURI(URI uri){
    URI normalizedUri = uri.normalize();
    String normalizedPath = normalizedUri.getPath();
    if ("file".equalsIgnoreCase(uri.getScheme()) && uri.getPath() != null && uri.getPath().startsWith(UNC_PREFIX) && (normalizedPath == null || !normalizedPath.startsWith(UNC_PREFIX))){
    try {
        normalizedUri = new URI(normalizedUri.getScheme(), ensureUNCPath(normalizedUri.getSchemeSpecificPart()), normalizedUri.getFragment());
      } catch (URISyntaxException e) {
        LogUtils.warn(e);
      }
    }
}
}
//48
public class func{
	public void apply(Instance input){
                checkNotNull(input);
                final URI original = URI.create("http://" + input.getHostname());
                    return new URI(
                           original.getScheme(),
                           original.getUserInfo(),
                           original.getHost(),
                           original.getPort(),
                           "",
                           original.getQuery(),
                           original.getFragment());
}
}
//49
public class func{
	public void extendPath(final Path parent,final String extension){
      final URI extendedUri = new URI(parentUri.getScheme(),
        ((parentUri.getAuthority() != null) ? parentUri.getAuthority() : ""), extendedPath,
        parentUri.getQuery(), parentUri.getFragment());
      return new Path(extendedUri);
}
}
//50
public class func{
	public void getURIForLocation(IPath location){
      URI newURI = new URI(projURI.getScheme(), projURI.getUserInfo(),
          projURI.getHost(), projURI.getPort(), location.toString(), projURI.getQuery(), projURI
              .getFragment());
}
}
//51
public class func{
	public void initialize(URI name,Configuration conf){
      URI realUri = new URI (realScheme, realAuthority,
                            name.getPath(), name.getQuery(), name.getFragment());
}
}
//52
public class func{
	public void addParents(URI resource,JSONObject representation,ProjectInfo project,IPath resourcePath,HttpServletRequest request,String tree){
        addParent(parents, project.getFullName(), new URI(resource.getScheme(), resource.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment()), resourcePath, request, tree);
}
}
//53
public class func{
	public void addParents(URI resource,JSONObject representation,ProjectInfo project,IPath resourcePath,HttpServletRequest request,String tree){
        addParent(parents, resourcePath.lastSegment(), new URI(resource.getScheme(), resource.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment()), resourcePath, request, tree);
}
}
//54
public class func{
	public void bind(){
                setConnectURI(new URI(bind.getScheme(), bind.getUserInfo(), addr.getHostAddress(), serverSocket.getLocalPort(), bind.getPath(),
                    bind.getQuery(), bind.getFragment()));
}
}
//55
public class func{
	public void createFullURI(URI uri){
        return new URI(
                scheme, authority, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//56
public class func{
	public void getEntry(String key){
        if ((requestedUri.getScheme().equals("http") && requestedUri.getPort() == 80)
                || (requestedUri.getScheme().equals("https") && requestedUri.getPort() == 443)) {
            // Strip away default http ports
            try {
                requestedUri = new URI(requestedUri.getScheme(), requestedUri.getHost(),
                        requestedUri.getPath(), requestedUri.getFragment());
            } catch (final URISyntaxException e) {
            }
        }
}
}
//57
public class func{
	public void listEntry(String name,long timeStamp,boolean isDir,long length,URI location,String appendName){
        if (appendName != null) {
          if (!appendName.startsWith("/") && !location.getPath().endsWith("/")) //$NON-NLS-1$  //$NON-NLS-2$
            appendName = "/" + appendName; //$NON-NLS-1$
          location = new URI(location.getScheme(), location.getAuthority(), location.getPath() + appendName, null, location.getFragment());
          if (isDir) {
            location = URIUtil.append(location, ""); //$NON-NLS-1$
          }
        }
}
}
//58
public class func{
	public void resolvePathFromBaseLocation(String pathStr0,IPath baseLocation){
      return new URI(uri.getScheme(), uri.getAuthority(), pathStr, uri.getQuery(), uri.getFragment());
}
}
//59
public class func{
	public void makeGetRequest(String urlString,HashMap<String,String> queryParams,boolean enableCache,int cacheMaxAge){
      if (queryParams != null && queryParams.size() > 0) {
        List<NameValuePair> pairs = Lists.newArrayListWithCapacity(queryParams.size());
        for (String paramName : queryParams.keySet()) {
          pairs.add(new BasicNameValuePair(paramName, queryParams.get(paramName)));
        }

        uri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), URLEncodedUtils.format(pairs, "UTF-8"), uri.getFragment());
      }
      HttpGet request = new HttpGet(uri);
      addDefaultHeaders(request);
      Gdx.app.debug(TAG, "REQ: GET " + uri);
}
}
//60
public class func{
	public void normalizePath(Path path){
    URI uri = path.toUri();
    if (uri.getScheme() == null) {
      try {
        uri = new URI("file", uri.getHost(), uri.getPath(), uri.getFragment());
        path = new Path(uri.toString());
      } catch (URISyntaxException e) {
        throw new IllegalArgumentException("path is invalid", e);
      }
    }
}
}
//61
public class func{
	public void toJSON(WorkspaceInfo workspace,URI requestLocation,URI baseLocation){
        child.put(ProtocolConstants.KEY_NAME, project.getFullName());
        child.put(ProtocolConstants.KEY_DIRECTORY, true);
        URI contentLocation = computeProjectURI(baseLocation, workspace, project);
        child.put(ProtocolConstants.KEY_LOCATION, contentLocation);
          if (projectStore != null)
            child.put(ProtocolConstants.KEY_LOCAL_TIMESTAMP, projectStore.fetchInfo(EFS.NONE, null).getLastModified());
          child.put(ProtocolConstants.KEY_CHILDREN_LOCATION, new URI(contentLocation.getScheme(), contentLocation.getUserInfo(), contentLocation.getHost(), contentLocation.getPort(), contentLocation.getPath(), ProtocolConstants.PARM_DEPTH + "=1", contentLocation.getFragment())); //$NON-NLS-1$
}
}
//62
public class func{
	public void getDiffs(){
      result.put(ProtocolConstants.KEY_LENGTH, l.size());
      if (i < l.size()) {
        URI diffLocation = createDiffLocation(revCommit.getName(), fromName, "");
        URI nextLocation = new URI(diffLocation.getScheme(), diffLocation.getUserInfo(), diffLocation.getHost(), diffLocation.getPort(),
            diffLocation.getPath(), "pageSize=" + pageSize + "&page=" + (page + 1), diffLocation.getFragment());
        result.put(ProtocolConstants.KEY_NEXT_LOCATION, nextLocation);
      }
}
}
//63
public class func{
	public void handleGetDiffs(HttpServletRequest request,HttpServletResponse response,Repository db,String scope,String pattern){
    result.put(ProtocolConstants.KEY_LENGTH, l.size());
    if (i < l.size()) {
      URI nextLocation = new URI(diffLocation.getScheme(), diffLocation.getUserInfo(), diffLocation.getHost(), diffLocation.getPort(),
          diffLocation.getPath(), "pageSize=" + pageSize + "&page=" + (page + 1), diffLocation.getFragment()); //$NON-NLS-1$ //$NON-NLS-2$
      result.put(ProtocolConstants.KEY_NEXT_LOCATION, nextLocation);
    }
    OrionServlet.writeJSONResponse(request, response, result, JsonURIUnqualificationStrategy.ALL_NO_GIT);
}
}
//64
public class func{
	public void encode(final RestRequest request,RequestContext requestContext,int threshold){
    uri = new URI(uri.getScheme(),
                  uri.getUserInfo(),
                  uri.getHost(),
                  uri.getPort(),
                  uri.getPath(),
                  null,
                  uri.getFragment());
    ByteString entity = request.getEntity();
    if (entity == null || entity.length() == 0)
    {
      requestBuilder.setHeader(HEADER_CONTENT_TYPE, FORM_URL_ENCODED);
      requestBuilder.setEntity(ByteString.copyString(query, Data.UTF_8_CHARSET));
    }
    else
    {
      // If we have a body, we must preserve it, so use multipart/mixed encoding

      MimeMultipart multi = createMultiPartEntity(entity, request.getHeader(HEADER_CONTENT_TYPE), query);
      requestBuilder.setHeader(HEADER_CONTENT_TYPE, multi.getContentType());
      ByteArrayOutputStream os = new ByteArrayOutputStream();
      multi.writeTo(os);
      requestBuilder.setEntity(ByteString.copy(os.toByteArray()));
    }
}
}
//65
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestParameterMethodHS256Step2", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                    URI uri = new URI(response.getHeader("Location").toString());
                    assertNotNull(uri.getFragment(), "Query string is null");
                    Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());
                    assertNotNull(params.get("access_token"), "The accessToken is null");
                    assertNotNull(params.get("scope"), "The scope is null");
                    assertNotNull(params.get("state"), "The state is null");
}
}
//66
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestAuthorizationWithoutScope", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                    URI uri = new URI(response.getHeader("Location").toString());
                    assertNotNull(uri.getFragment(), "Query string is null");
                    Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());
                    assertNotNull(params.get(AuthorizeResponseParam.CODE), "The code is null");
                    assertNotNull(params.get(AuthorizeResponseParam.ID_TOKEN), "The id token is null");
                    assertNotNull(params.get(AuthorizeResponseParam.STATE), "The state is null");
                    assertEquals(params.get(AuthorizeResponseParam.STATE), state);
}
}
//67
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestFileMethod", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                    URI uri = new URI(response.getHeader("Location").toString());
                    assertNotNull(uri.getFragment(), "Query string is null");
                    Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());
                    assertNotNull(params.get("access_token"), "The accessToken is null");
                    assertNotNull(params.get("id_token"), "The idToken is null");
                    assertNotNull(params.get(AuthorizeResponseParam.SCOPE), "The scope is null");
                    assertNotNull(params.get(AuthorizeResponseParam.STATE), "The state is null");
                    assertEquals(params.get(AuthorizeResponseParam.STATE), state);
}
}
//68
public class func{
	public void buildPingUrl(){
        return new URI(
                uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                uri.getPath(), query, uri.getFragment()
        ).toURL();
}
}
//69
public class func{
	public void addParent(JSONArray parents,String name,URI location,IPath resourcePath,HttpServletRequest request,String tree){
      parent = new JSONObject();
      parent.put(ProtocolConstants.KEY_LOCATION, location);
        childLocation = new URI(location.getScheme(), location.getUserInfo(), location.getHost(), location.getPort(), location.getPath(), "depth=1", location.getFragment()); //$NON-NLS-1$
}
}
//70
public class func{
	public void createURIWithQuery(final URI uri,final String query){
        return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), query, uri.getFragment());
}
}
//71
public class func{
	public void callback(HttpDownloader downloader,URI uri,String query){
    uri = new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(),
        uri.getPath(), query, uri.getFragment());
}
}
//72
public class func{
	public void getJavaFileForOutput(Location location,String className,Kind kind,FileObject sibling){
        URI uri = sibling.toUri();
          String path = uri.getPath();
          index = path.lastIndexOf('/');
          if (index != -1) {
            path = path.substring(0, index + 1);
            path += normalizedFileName;
          }
          uri2 = new URI(uri.getScheme(), uri.getHost(), path, uri.getFragment());
        return new EclipseFileObject(className, uri2, kind, this.charset);
}
}
//73
public class func{
	public void safeRelativize(final URI baseURI,final URI toUri){
        if (m == toPath.length()) {
            // No path difference, return query + fragment
            return new URI(null, null, null, toUri.getQuery(),
                    toUri.getFragment()).toString();
        } else {
            toPath = toPath.substring(truncatePtr);
            final StringBuilder sb = new StringBuilder();
            while (ellipsesCount > 0) {
                sb.append("../");
                ellipsesCount--;
            }

            if (!Utility.isNullOrEmpty(toPath)) {
                sb.append(toPath);
            }

            if (!Utility.isNullOrEmpty(toUri.getQuery())) {
                sb.append("?");
                sb.append(toUri.getQuery());
            }
            if (!Utility.isNullOrEmpty(toUri.getFragment())) {
                sb.append("#");
                sb.append(toUri.getRawFragment());
            }

            return sb.toString();
        }
}
}
//74
public class func{
	public void addQueryString(String url,String... encodedPairs){
        return new URI(aURI.getScheme(), aURI.getAuthority(), aURI.getPath(), query,
                aURI.getFragment()).toString();
}
}
//75
public class func{
	public void setArchived(Partition p,Path parentDir,String dirInArchive,String archiveName){
      harUri = new URI("har", parentUri.getUserInfo(), harHost, parentUri.getPort(),
          new Path(getArchiveDirOnly(parentDir, archiveName), dirInArchive).toUri().getPath(),
          parentUri.getQuery(), parentUri.getFragment());
}
}
//76
public class func{
	public void translateTransferable(Transferable contents,DataFlavor flavor,long format){
            final ProtectionDomain userProtectionDomain = getUserProtectionDomain(contents);
            final ArrayList<String> fileList = castToFiles(list, userProtectionDomain);
            final ArrayList<String> uriList = new ArrayList<String>(fileList.size());
            for (String fileObject : fileList) {
                final URI uri = new File(fileObject).toURI();
                // Some implementations are fussy about the number of slashes (file:///path/to/file is best)
                try {
                    uriList.add(new URI(uri.getScheme(), "", uri.getPath(), uri.getFragment()).toString());
                } catch (URISyntaxException uriSyntaxException) {
                    throw new IOException(uriSyntaxException);
                  }
              }
}
}
//77
public class func{
	public void setArchived(Partition p,Path parentDir,String dirInArchive,String archiveName){
      harUri = new URI("har", parentUri.getUserInfo(), harHost, parentUri.getPort(),
          getArchiveDirOnly(parentDir, archiveName),
          parentUri.getQuery(), parentUri.getFragment());
}
}
//78
public class func{
	public void multipleSCMs(){
        run(sampleRepo, "svnadmin", "create", "--compatible-version=1.5", sampleRepo.getAbsolutePath());
        File sampleWc = tmp.newFolder();
        run(sampleWc, "svn", "co", sampleRepoU, ".");
        FileUtils.touch(new File(sampleWc, "file"));
        run(sampleWc, "svn", "commit", "--message=init");
        File otherRepo = tmp.newFolder();
        u = otherRepo.toURI();
        String otherRepoU = new URI(u.getScheme(), "", u.getPath(), u.getFragment()).toString();
}
}
//79
public class func{
	public void multipleSCMs(){
        File sampleRepo = tmp.newFolder();
        URI u = sampleRepo.toURI();
        String sampleRepoU = new URI(u.getScheme(), "", u.getPath(), u.getFragment()).toString(); // TODO SVN rejects File.toUri syntax (requires blank authority field)
}
}
//80
public class func{
	public void toJSON(IFileStore store,IFileInfo info,URI location){
            result.put(ProtocolConstants.KEY_CHILDREN_LOCATION, new URI(location.getScheme(), location.getAuthority(), location.getPath(), "depth=1", location.getFragment())); //$NON-NLS-1$
}
}
//81
public class func{
	public void listEntry(String name,long timeStamp,boolean isDir,long length,URI location,String appendName){
            jsonObject.put(ProtocolConstants.KEY_CHILDREN_LOCATION, new URI(location.getScheme(), location.getAuthority(), location.getPath(),
                "depth=1", location.getFragment())); //$NON-NLS-1$
}
}
//82
public class func{
	public void getNextPageLocation(){
      return new URI(location.getScheme(), location.getAuthority(), location.getPath(), query, location.getFragment());
}
}
//83
public class func{
	public void toHttpUrl(final String url,final IREnv rEnv,final String target){
              return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                  sb.toString(), uri.getQuery(), uri.getFragment()).toString();
}
}
//84
public class func{
	public void safeRelativize(URI baseUri,URI uriToRelativize){
    if (baseUriPathIndex == uriToRelativizePath.length())
      return (new URI(null, null, null, uriToRelativize.getQuery(), uriToRelativize.getFragment())).toString();
    uriToRelativizePath = uriToRelativizePath.substring(i);
}
}
//85
public class func{
	public void writeTo(ResourceBundleDispatcher arg0,Class<?> arg1,Type arg2,Annotation[] arg3,MediaType arg4,MultivaluedMap<String,Object> arg5,OutputStream arg6){
            URI dispatch = new URI(null, null, path, uri.getQuery(), uri.getFragment());
            servletContext.getRequestDispatcher(dispatch.toString()).forward(request, response);
}
}
//86
public class func{
	public void handleGetDiffs(HttpServletRequest request,HttpServletResponse response,Repository repo,String sha,String refName,OutputStream out){
      if (i < l.size()) {
        URI nextLocation = new URI(
            diffLocation.getScheme(),
            diffLocation.getUserInfo(),
            diffLocation.getHost(),
            diffLocation.getPort(),
            diffPath.toString(),
            "pageSize=" + pageSize + "&page=" + (page + 1), diffLocation.getFragment()); //$NON-NLS-1$ //$NON-NLS-2$
        result.put(KEY_NEXT_LOCATION, nextLocation);
      }
      writeJSONResponse(request, response, result);
}
}
//87
public class func{
	public void JsonRef(final URI uri){
        final String scheme = uri.getScheme();
        final String ssp = uri.getSchemeSpecificPart();
        final String fragment = Optional.fromNullable(uri.getFragment()).or("");
            ptr = fragment.isEmpty() ? JsonPointer.empty()
                : new JsonPointer(fragment);
            this.uri = new URI(scheme, ssp, fragment);
            locator = new URI(scheme, ssp, "");
            asString = this.uri.toString();
            hashCode = asString.hashCode();
}
}
//88
public class func{
	public void baseToRemoteLocation(URI base,String remote,String branch){
      return new URI(base.getScheme(), base.getUserInfo(), base.getHost(), base.getPort(), p.toString(), base.getQuery(), base.getFragment());
}
}
//89
public class func{
	public void appendPathToUri(URI baseUri,String path,String pathSeparator){
    return new URI(baseUri.getScheme(), baseUri.getAuthority(),
        stringbuilder.toString(), baseUri.getQuery(),
        baseUri.getFragment());
}
}
//90
public class func{
	public void getCloneLocation(URI base,BaseToCloneConverter converter){
    return new URI(base.getScheme(), base.getUserInfo(), base.getHost(), base.getPort(), p.toString(), base.getQuery(), base.getFragment());
}
}
//91
public class func{
	public void toHttpUrl(final URI url){
      return new URI("http", null, fHttpd.getHost(), fHttpd.getPort(),
          path, url.getQuery(), url.getFragment());
}
}
//92
public class func{
	public void getAbsoluteUri(final MapModel map,final URI uri){
      return new URI(url.getProtocol(), url.getHost(), url.getPath(), uri.getQuery(), uri.getFragment());
}
}
//93
public class func{
	public void createNewURIFromPath(URI locationOnSameFilesystem,String path){
      return new URI(uri.getScheme(), uri.getAuthority(), pathBuf.toString(), // replaced!
          uri.getQuery(), uri.getFragment());
}
}
//94
public class func{
	public void appendPathToSingleUri(final URI uri,final String relativeUri,final String separator){
        return new URI(uri.getScheme(), uri.getAuthority(), pathString.toString(), uri.getQuery(), uri.getFragment());
}
}
//95
public class func{
	public void handleMethodGET(URI uri,HTTPRequest request,ToadletContext ctx){
      outuri = new URI(null, null,
               path, uri.getQuery(), uri.getFragment());
}
}
//96
public class func{
	public void getAbsoluteUri(final MapModel map,URI uri){
      return new URI(url.getProtocol(), url.getHost(), url.getPath(), uri.getQuery(), uri.getFragment());
}
}
//97
public class func{
	public void baseToConfigEntryLocation(URI base,String entryKey){
      return new URI(base.getScheme(), base.getUserInfo(), base.getHost(), base.getPort(), p.toString(), base.getQuery(), base.getFragment());
}
}
//98
public class func{
	public void createContentLocation(URI cloneLocation,final DiffEntry entr,String path){
    return new URI(cloneLocation.getScheme(), cloneLocation.getUserInfo(), cloneLocation.getHost(), cloneLocation.getPort(), result.makeAbsolute()
        .toString(), cloneLocation.getQuery(), cloneLocation.getFragment());
}
}
//99
public class func{
	public void getIndexLocation(URI base,BaseToIndexConverter converter){
    return new URI(base.getScheme(), base.getUserInfo(), base.getHost(), base.getPort(), p.toString(), base.getQuery(), base.getFragment());
}
}
//100
public class func{
	public void baseToCommitLocation(URI base,String commit,String path){
      return new URI(base.getScheme(), base.getUserInfo(), base.getHost(), base.getPort(), p.toString(), getQuery(base.getQuery()), base.getFragment());
}
}
//101
public class func{
	public void testFindFilesByLocation(){
      URI upperCase= new URI(uri.getScheme(), uri.getSchemeSpecificPart().toUpperCase(), uri.getFragment());
}
}
//102
public class func{
	public void testSetQueryParams(){
        initialUri = new URI("http://un:ps@server.com:9876/p1/p2?z=3,y=4#fragment");
        final URI updatedUri = URIUtils.setQueryParams(initialUri, params);
        assertFalse(updatedUri.toString().contains("a #"));
        assertFalse(updatedUri.toString().contains("1#t"));
        assertFalse(updatedUri.toString().contains(" &time"));
        assertFalse(updatedUri.toString().contains("#trick"));
        assertEquals("http", updatedUri.getScheme());
        assertEquals("fragment", updatedUri.getFragment());
        assertEquals("server.com", updatedUri.getHost());
        assertEquals("/p1/p2", updatedUri.getPath());
        assertEquals(9876, updatedUri.getPort());
}
}
//103
public class func{
	public void testRelativePathOnQuery(){
        URI base = new URI("http://host/file?query/x");
        URI uri = base.resolve("another");
        assertEquals("http://host/another", uri.toString());
        assertEquals("/another", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals(null, uri.getFragment());
}
}
//104
public class func{
	public void removeQueryString(String url,String... keys){
        return new URI(aURI.getScheme(), aURI.getAuthority(), aURI.getPath(),
                StringUtils.join(pairStrings, "&"), aURI.getFragment()).toString();
}
}
//105
public class func{
	public void testQuestionMarkInFragment(){
        URI uri = new URI("http://host/file#fragment?query");
        assertEquals("/file", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals("fragment?query", uri.getFragment());
}
}
//106
public class func{
	public void open(URI address){
        return super.open(new URI(
            getInfo().id(),
            address.getSchemeSpecificPart(),
            address.getFragment()).normalize());
}
}
//107
public class func{
	public void open(URI address){
          return super.open(new URI(
              getInfo().id(),
              address.getSchemeSpecificPart(),
              address.getFragment()).normalize());
}
}
//108
public class func{
	public void assertDecoded(String decoded,String original){
        assertEquals(decoded, new URI("http://foo#" + original).getFragment());
        assertEquals(decoded, URLDecoder.decode(original));
        assertEquals(decoded, URLDecoder.decode(original, "UTF-8"));
}
}
//109
public class func{
	public void testEscapeResolvedUrl(){
  String escaped = RealCDXExtractorOutput.resolve(context, spec);
  assertTrue(escaped.indexOf(" ") < 0);
  URI parsed = new URI(escaped);
  assertEquals("änchor", parsed.getFragment());
}
}
//110
public class func{
	public void testDecodingPlus(){
        assertEquals("a+b", new URI("http://foo#a+b").getFragment());
}
}
//111
public class func{
	public void processBug(Element element,IFeed feed){
          feed.setHomepage(new URI(baseUri.getScheme(), baseUri.getAuthority(), "/show_bug.cgi", "id=" + child.getText(), baseUri.getFragment())); //$NON-NLS-1$ //$NON-NLS-2$
}
}
//112
public class func{
	public void setQueryParams(final URI initialUri,final Multimap<String,String> queryParams){
                return new URI(initialUri.getScheme(), initialUri.getUserInfo(), initialUri.getHost(), initialUri.getPort(),
                        initialUri.getPath(),
                        queryString.toString(), initialUri.getFragment());
}
}
//113
public class func{
	public void setQueryParams(final URI initialUri,final Multimap<String,String> queryParams){
                return new URI(initialUri.getScheme(), initialUri.getAuthority(), initialUri.getPath(), queryString.toString(),
                        initialUri.getFragment());
}
}
//114
public class func{
	public void buildUri(URI uri,String additionalPath,String indexName,String login,String apiKey,String additionnalQuery){
    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(),
        uri.getPort(), path.toString(), query.toString(),
        uri.getFragment());
}
}
//115
public class func{
	public void resolveURI(URI base,URI uri){
            return new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), uri.getFragment());
}
}
//116
public class func{
	public void testColonInFragment(){
        URI uri = new URI("http://host/file#fragment:80");
        assertEquals("/file", uri.getPath());
        assertEquals(-1, uri.getPort());
        assertEquals("fragment:80", uri.getFragment());
}
}
//117
public class func{
	public void testEmptyAuthorityWithFragment(){
        URI uri = new URI("http://#fragment");
        assertEquals(null, uri.getAuthority());
        assertEquals("", uri.getPath());
        assertEquals("fragment", uri.getFragment());
}
}
//118
public class func{
	public void rewrite(JsonNode plan,Set<String> namesUsed,boolean debugMode,boolean revisit){
                for (JsonNode file : job.path("cachedFiles"))
                {
                    String filename = file.getTextValue();

                    filename = cleanLatestTag(filename);
                    URI uri = null;
                    String path, fragment;
                    try
                    {
                        uri = new URI(filename);
                        path = uri.getPath();
                        path = restoreLatestTag(path);

                        fragment = uri.getFragment();
                        if (path.contains("#LATEST"))
                        {
                          path =
                            FileSystemUtils.getLatestPath(fs, new Path(path))
                            .toString();
                          path = new URI(path).getPath();
                        }
                    }
                    catch (URISyntaxException e)
                    {
                        throw new PlanRewriteException(e);
                    }

                    // check if the fragment was already created earlier
                    if (fragment == null)
                        fragment = symlinkMap.get(path);

                    // create a new one
                    if (fragment == null)
                        fragment = "cached_" + (symlinkCounter++);

                    symlinkMap.put(path, fragment);
                    

                    // if (fs.isDirectory(new Path(path)))
                    // {
                    // Path childPath = null;
                    //
                    // FileStatus[] children = fs.globStatus(new Path(path + "/*"));
                    // for (FileStatus child : children)
                    // {
                    // childPath = child.getPath();
                    //
                    // if (fs.isDirectory(childPath))
                    // continue;
                    //
                    // String name = childPath.getName();
                    // if (name.startsWith("_") || name.startsWith("."))
                    // continue;
                    //
                    // break;
                    // }
                    //
                    // if (childPath == null)
                    // throw new IOException("No files found in directory: " + path);
                    //
                    // path = childPath.toString();
                    // }

                    cachedFiles.add(path + "#" + fragment);
                }
                ((ObjectNode) job).put("cachedFiles", cachedFiles);
}
}
//119
public class func{
	public void testSlashInFragment(){
        URI uri = new URI("http://host/file#fragment/path");
        assertEquals("/file", uri.getPath());
        assertEquals("fragment/path", uri.getFragment());
}
}
//120
public class func{
	public void translate(final URI source){
        URI uri = URIUtils.normalizeURI(namespace.resolve(source));
        final String fragment = uri.getFragment();
            uri = new URI(uri.getScheme(), uri.getSchemeSpecificPart(), null);
}
}
//121
public class func{
	public void appendQueryParameter(URI uri,OAuth2AccessToken accessToken){
        sb.append(uri.getFragment());
      return new URI(sb.toString());
}
}
