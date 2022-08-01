//0
public class func{
	public void uriSubpath(URI uri,String subpath){
    String path = uri.getPath();
    if (path != null && path.length() > 0)
    {
      subpath = path + "/" + subpath; //$NON-NLS-1$
    }
    if (uri.getScheme() != null && subpath.charAt(0) != '/')
    {
      subpath = "/" + subpath; //$NON-NLS-1$
    }
      return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), subpath, uri.getQuery(),
          uri.getFragment());
}
}
//1
public class func{
	public void addToCache(Configuration conf,Path appPath,String filePath,boolean archive){
            if (uri.getScheme() == null) {
                String resolvedPath = uri.getPath();
                if (!resolvedPath.startsWith("/")) {
                    resolvedPath = baseUri.getPath() + "/" + resolvedPath;
                }
                uri = new URI(baseUri.getScheme(), baseUri.getAuthority(), resolvedPath, uri.getQuery(), uri.getFragment());
            }
}
}
//2
public class func{
	public void HarPathHelper(HiveConf hconf,URI archive,URI originalBase){
      String parentHost = archive.getHost();
      if (parentHost == null) {
        harHost = archive.getScheme() + "-localhost";
      } else {
        harHost = archive.getScheme() + "-" + parentHost;
      }
      String path = addSlash(archive.getPath());
      if(!path.endsWith(".har/")) {
        throw new HiveException("HAR archive path must end with .har");
      }
        base = new URI("har", archive.getUserInfo(), harHost, archive.getPort(),
              path, archive.getQuery(), archive.getFragment());
}
}
//3
public class func{
	public void unqualifyURI(URI uri,String scheme,String hostname,int port){
    int uriPort = uri.getPort();
    if (uriPort == -1) {
      uriPort = getDefaultPort(uri.getScheme());
    }
    if (scheme.equals(uri.getScheme()) && hostname.equals(uri.getHost())
        && port == uriPort) {
      try {
        simpleURI = new URI(null, null, null, -1, uri.getPath(),
            uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        simpleURI = uri;
      }
    }
}
}
//4
public class func{
	public void showURI(final String message,final URI uri){
        System.err.println("0.0.0 string:      "+uri.toString());
        System.err.println("0.0.0 ascii :      "+uri.toASCIIString());
        System.err.println("1.0.0 scheme:      "+uri.getScheme());
        System.err.println("2.0.0 scheme-part: "+uri.getRawSchemeSpecificPart()+" (raw), "+uri.getSchemeSpecificPart()+" (dec)");
        System.err.println("2.1.0 auth:        "+uri.getRawAuthority()+" (raw), "+uri.getAuthority()+" (dec)");
        System.err.println("2.1.1 user-info:   "+uri.getRawUserInfo()+" (raw), "+uri.getUserInfo()+" (dec)");
        System.err.println("2.1.1 host:        "+uri.getHost());
        System.err.println("2.1.1 port:        "+uri.getPort());
        System.err.println("2.2.0 path:        "+uri.getRawPath()+" (raw), "+uri.getPath()+" (dec)");
        System.err.println("2.3.0 query:       "+uri.getRawQuery()+" (raw), "+uri.getQuery()+" (dec)");
        System.err.println("3.0.0 fragment:    "+uri.getRawFragment()+" (raw), "+uri.getFragment()+" (dec)");
}
}
//5
public class func{
	public void normalizeUriPath(URI uri){
        if (isNullOrEmpty(uri.getPath())) {
            return uri;
        }
        if ("/".equals(uri.getPath())) {
            try {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), "", uri.getQuery(), uri.getFragment());
            } catch (URISyntaxException e) { // sigh exception.
                LOG.warn("Could not process transportAddress {}, invalid URI syntax", uri);
                return uri;
            }
        }
        LOG.warn("Could not normalize path on node transport address, it contained some unrecognized path: {}", uri);
}
}
//6
public class func{
	public void dump(String description,URI dburi){
    String dumpString = String.format(
                     "dump (%s)\n: isOpaque=%s, isAbsolute=%s Scheme=%s,\n SchemeSpecificPart=%s,\n Host=%s,\n Port=%s,\n Path=%s,\n Fragment=%s,\n Query=%s\n"
                     , description
                     , dburi.isOpaque()
                     , dburi.isAbsolute()
                     , dburi.getScheme()
                     , dburi.getSchemeSpecificPart()
                     , dburi.getHost()
                     , dburi.getPort()
                     , dburi.getPath()
                     , dburi.getFragment()
                     , dburi.getQuery()
                     );
    LOGGER.fine(dumpString);
    String query = dburi.getQuery();
    if (null != query && !query.equals(""))
    {
      String[] params = query.split("&");  
      Map<String, String> map = new HashMap<String, String>();  
      for (String param : params)  
      {  
          String[] splits = param.split("=");  
          String name =splits[0];
          String value = null ;
          if (splits.length > 1 ) 
          {
            value = splits[1] ;
          }
          map.put(name, value);  
          LOGGER.fine(String.format("name=%s,value=%s\n",name,value));
      }  
    }
}
}
//7
public class func{
	public void getUriWithDefaultPath(final URI uri,final String path){
        if (uri == null) {
            return null;
        }
                    uri.getScheme(),
                    uri.getUserInfo(),
                    uri.getHost(),
                    uri.getPort(),
                    isNullOrEmpty(uri.getPath()) ? path : uri.getPath(),
                    uri.getQuery(),
                    uri.getFragment());
            throw new RuntimeException("Could not parse URI.", e);
}
}
//8
public class func{
	public void dump(String description,URI dburi){
                        description, dburi.isOpaque(), dburi.isAbsolute(), dburi.getScheme(),
                        dburi.getSchemeSpecificPart(), dburi.getHost(), dburi.getPort(), dburi.getPath(),
                        dburi.getFragment(), dburi.getQuery());
        String query = dburi.getQuery();
        if (null != query && !query.equals("")) {
            String[] params = query.split("&");
            Map<String, String> map = new HashMap<String, String>();
            for (String param : params) {
                String[] splits = param.split("=");
                String name = splits[0];
                String value = null;
                if (splits.length > 1) {
                    value = splits[1];
                }
                map.put(name, value);
                System.err.printf("name=%s,value=%s\n", name, value);
            }
        }
}
}
//9
public class func{
	public void testUriParts(){
        URI uri = new URI("http://username:password@host:8080/directory/file?query#ref");
        assertEquals("http", uri.getScheme());
        assertEquals("username:password@host:8080", uri.getAuthority());
        assertEquals("username:password@host:8080", uri.getRawAuthority());
        assertEquals("username:password", uri.getUserInfo());
        assertEquals("username:password", uri.getRawUserInfo());
        assertEquals("host", uri.getHost());
        assertEquals(8080, uri.getPort());
        assertEquals("/directory/file", uri.getPath());
        assertEquals("/directory/file", uri.getRawPath());
        assertEquals("query", uri.getQuery());
        assertEquals("query", uri.getRawQuery());
        assertEquals("ref", uri.getFragment());
        assertEquals("ref", uri.getRawFragment());
        assertEquals("//username:password@host:8080/directory/file?query",
                uri.getSchemeSpecificPart());
        assertEquals("//username:password@host:8080/directory/file?query",
                uri.getRawSchemeSpecificPart());
}
}
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
//11
public class func{
	public void writeURI(PrintWriter w,URI u,String msg){
        if (DEBUG.META) writeField(w, "hashCode",       Integer.toHexString(u.hashCode()));
        writeField(w, "scheme",               u.getScheme());
        writeField(w, "scheme-specific",      u.getSchemeSpecificPart(), u.getRawSchemeSpecificPart());
        writeField(w, "authority",            u.getAuthority(), u.getRawAuthority());
        writeField(w, "userInfo",             u.getUserInfo(), u.getRawUserInfo());
        writeField(w, "host",                 u.getHost());
        if (u.getPort() != -1)
            writeField(w, "port",  u.getPort());
        writeField(w, "path",         u.getPath(), u.getRawPath());
        writeField(w, "query",        u.getQuery(), u.getRawQuery());
        writeField(w, "fragment",     u.getFragment(), u.getRawFragment());
}
}
//12
public class func{
	public void show(int i,String title,String rawURI,boolean query,boolean fragment){
    System.out.printf("\t- Scheme..............: %s%n",uri.getScheme());
    System.out.printf("\t- Scheme specific part: %s%n",uri.getSchemeSpecificPart());
    System.out.printf("\t  + Authority.........: %s%n",uri.getAuthority());
    System.out.printf("\t    * User info.......: %s%n",uri.getUserInfo());
    System.out.printf("\t    * Host............: %s%n",uri.getHost());
    System.out.printf("\t    * Port............: %s%n",uri.getPort());
    System.out.printf("\t  + Path..............: %s%n",uri.getPath());
    System.out.printf("\t  + Query.............: %s%n",uri.getQuery());
    System.out.printf("\t- Fragment............: %s%n",uri.getFragment());
    System.out.printf("\t- Flags...............: %s%n",flags(uri));
}
}
//13
public class func{
	public void testExtractURIComponent(){
    URI uri = new URI(uriStr);
    testExtractURIComponent2(uriStr, "scheme", uri.getScheme());
    testExtractURIComponent2(uriStr, "authority", uri.getAuthority());
    testExtractURIComponent2(uriStr, "path", uri.getPath());
    testExtractURIComponent2(uriStr, "query", uri.getQuery());
    testExtractURIComponent2(uriStr, "fragment", uri.getFragment());
    testExtractURIComponent2(uriStr, "host", uri.getHost());
    testExtractURIComponent2(uriStr, "port", uri.getPort());
    testExtractURIComponent2(uriStr, "schemeSpecificPart", uri.getSchemeSpecificPart());
    testExtractURIComponent2(uriStr, "userInfo", uri.getUserInfo());
      testExtractURIComponent2(uriStr, "illegalType", uri.getUserInfo());
      fail();
    testExtractURIComponent2("invalidURI:", "host", uri.getHost(), false);
}
}
//14
public class func{
	public void test_ConstructorLjava_lang_StringLjava_lang_StringLjava_lang_StringLjava_lang_StringLjava_lang_String(){
        URI uri = new URI("ht12-3+tp", "", "/p#a%E2%82%ACth", "q^u%25ery",
                "f/r\u00DFag");
        assertEquals("wrong scheme", "ht12-3+tp", uri.getScheme());
        assertNull("wrong authority", uri.getUserInfo());
        assertNull("wrong userinfo", uri.getUserInfo());
        assertNull("wrong hostname", uri.getHost());
        assertEquals("wrong port number", -1, uri.getPort());
        assertEquals("wrong path", "/p#a%E2%82%ACth", uri.getPath());
        assertEquals("wrong query", "q^u%25ery", uri.getQuery());
        assertEquals("wrong fragment", "f/r\u00DFag", uri.getFragment());
        assertEquals("wrong SchemeSpecificPart", "///p#a%E2%82%ACth?q^u%25ery",
                uri.getSchemeSpecificPart());
        assertEquals("wrong RawSchemeSpecificPart",
                "///p%23a%25E2%2582%25ACth?q%5Eu%2525ery", uri
                .getRawSchemeSpecificPart());
        assertEquals(
                "incorrect toString()",
                "ht12-3+tp:///p%23a%25E2%2582%25ACth?q%5Eu%2525ery#f/r\u00dfag",
                uri.toString());
        assertEquals("incorrect toASCIIString()",

                "ht12-3+tp:///p%23a%25E2%2582%25ACth?q%5Eu%2525ery#f/r%C3%9Fag", uri
                .toASCIIString());
}
}
//15
public class func{
	public void resolve(Object key){
      headers.put("authority", uri.getAuthority());
      headers.put("fragment", uri.getFragment());
      headers.put("host", uri.getHost());
      headers.put("path", uri.getPath());
      headers.put("port", String.valueOf(uri.getPort()));
      headers.put("query", uri.getQuery());
      if(null != uri.getQuery()) {
        try {
          String query = URLDecoder.decode(uri.getQuery(), "ISO-8859-1");
          for(String s : query.split("&")) {
            String[] parts = s.split("=");
            headers.put(parts[0], parts[1]);
          }
        } catch(UnsupportedEncodingException e) {
          throw new IllegalArgumentException(e);
        }
      }
      headers.put("scheme", uri.getScheme());
      headers.put("userInfo", uri.getUserInfo());
}
}
//16
public class func{
	public void getLegacyRepoUri(URI datasetUri,String namespace){
    if (Sets.newHashSet("hdfs", "file", "hive").contains(repoScheme)) {
      try {
        specificUri = new URI(specificUri.getScheme(), specificUri.getUserInfo(),
            specificUri.getHost(), specificUri.getPort(),
            specificUri.getPath() + "/" + namespace,
            specificUri.getQuery(), specificUri.getFragment());
        repoUri = URI.create("repo:" + specificUri.toString());
      } catch (URISyntaxException ex) {
        throw new DatasetException("Error generating legacy URI", ex);
      }
    }
}
}
//17
public class func{
	public void getAuthenticatedUrl(String mirrorRepoUrl,String username,String password){
        if (!mirrorRepoUrl.toLowerCase().startsWith("http")) {
            return mirrorRepoUrl;
        }
        URI uri = URI.create(mirrorRepoUrl);
        return new URI(uri.getScheme(), userInfo, uri.getHost(), uri.getPort(),
                uri.getPath(), uri.getQuery(), uri.getFragment()).toString();
}
}
//18
public class func{
	public void updateHeaders(RequestContext context,Multimap<String,String> headers){
                    String initial = context.request().uri();
                    URI uri = URI.create(initial);
                        URI newURI = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                                location.getPath(), location.getQuery(), location.getFragment());
                        headers.remove(h.getKey(), h.getValue());
}
}
//19
public class func{
	public void testToUri(){
      assertEquals("file:///asd%20/sd", VfsUtil.toUri(new File("/asd /sd")).toASCIIString());
    URI uri = VfsUtil.toUri("file:///asd");
    assertNotNull(uri);
    assertEquals("file", uri.getScheme());
    assertEquals("/asd", uri.getPath());
    uri = VfsUtil.toUri("file:///asd/ ads/ad#test");
    assertNotNull(uri);
    assertEquals("file", uri.getScheme());
    assertEquals("/asd/ ads/ad", uri.getPath());
    assertEquals("test", uri.getFragment());
    uri = VfsUtil.toUri("file:///asd/ ads/ad#");
    assertNotNull(uri);
    assertEquals("file:///asd/%20ads/ad#", uri.toString());
    uri = VfsUtil.toUri("mailto:someone@example.com");
    assertNotNull(uri);
    assertEquals("someone@example.com", uri.getSchemeSpecificPart());
}
}
//20
public class func{
	public void getMatchingPartitions(String graphId,URI locationToMatch){
    if (locationToMatch == null || locationToMatch.isOpaque()) {
      throw new IllegalArgumentException();
    }
    locationToMatch = locationToMatch.normalize();
    final String scheme = locationToMatch.getScheme();
    final String userinfo = locationToMatch.getUserInfo();
    final String host = locationToMatch.getHost();
    final int port = locationToMatch.getPort();
    final URI path = URI.create(locationToMatch.getPath());
    final String query = locationToMatch.getQuery();
    final String fragment = locationToMatch.getFragment();
}
}
//21
public class func{
	public void testAddToCache(){
        Path appDifferentClusterPath = new Path(new URI(appUri.getScheme(), null, appUri.getHost() + "x",
            appUri.getPort(), appUri.getPath(), appUri.getQuery(), appUri.getFragment()));
}
}
//22
public class func{
	public void buildURI(NodeId nodeId,URI baseUri){
        return new URI(
                baseUri.getScheme(),
                baseUri.getUserInfo(),
                baseUri.getHost(),
                baseUri.getPort(),
                baseUri.getPath(),
                isNullOrEmpty(baseUri.getQuery()) ? queryParams : baseUri.getQuery() + "&" + queryParams,
                baseUri.getFragment()
        );
}
}
//23
public class func{
	public void buildRevisionFromMap(URI documentURI,Map<String,? extends Object> map){
                documentURI.getQuery();
                String attachmentURIPath = documentURI.getPath()+"/"+key;
                    attachmentURI = new URI(documentURI.getScheme(),
                            documentURI.getUserInfo(),
                            documentURI.getHost(),
                            documentURI.getPort(),
                            attachmentURIPath,
                            documentURI.getQuery(),
                            documentURI.getFragment());
}
}
//24
public class func{
	public void populateFromURI(CamelContext camelContext,EndpointConfiguration config,ParameterSetter setter){
        URI uri = config.getURI();
        setter.set(camelContext, config, EndpointConfiguration.URI_SCHEME, uri.getScheme());
        setter.set(camelContext, config, EndpointConfiguration.URI_SCHEME_SPECIFIC_PART, uri.getSchemeSpecificPart());
        setter.set(camelContext, config, EndpointConfiguration.URI_AUTHORITY, uri.getAuthority());
        setter.set(camelContext, config, EndpointConfiguration.URI_USER_INFO, uri.getUserInfo());
        setter.set(camelContext, config, EndpointConfiguration.URI_HOST, uri.getHost());
        setter.set(camelContext, config, EndpointConfiguration.URI_PORT, Integer.toString(uri.getPort()));
        setter.set(camelContext, config, EndpointConfiguration.URI_PATH, uri.getPath());
        setter.set(camelContext, config, EndpointConfiguration.URI_QUERY, uri.getQuery());
        setter.set(camelContext, config, EndpointConfiguration.URI_FRAGMENT, uri.getFragment());
            parameters = URISupport.parseParameters(uri);
            for (Map.Entry<String, Object> pair : parameters.entrySet()) {
                setter.set(camelContext, config, pair.getKey(), pair.getValue());
            }
}
}
//25
public class func{
	public void toHttp(final URI inputUri){
        Objects.requireNonNull(inputUri,"Input URI must not be null");
        String wsScheme = inputUri.getScheme();
        if ("http".equalsIgnoreCase(wsScheme) || "https".equalsIgnoreCase(wsScheme))
        {
            // leave alone
            httpScheme = wsScheme;
        }
        else if ("ws".equalsIgnoreCase(wsScheme))
        {
            // convert to http
            httpScheme = "http";
        }
        else if ("wss".equalsIgnoreCase(wsScheme))
        {
            // convert to https
            httpScheme = "https";
        }
        else
        {
            throw new URISyntaxException(inputUri.toString(),"Unrecognized WebSocket scheme");
        }
        return new URI(httpScheme,inputUri.getUserInfo(),inputUri.getHost(),inputUri.getPort(),inputUri.getPath(),inputUri.getQuery(),inputUri.getFragment());
}
}
//26
public class func{
	public void createAlternative(URI endpoint){
          endpoint.getScheme(),
          endpoint.getUserInfo(),
          "ldp4j".concat(endpoint.getHost()),
          endpoint.getPort(),
          endpoint.getPath(),
          endpoint.getFragment(),
          endpoint.getQuery()
      throw new IllegalStateException("Alternative URI creation failed",e);
}
}
//27
public class func{
	public void toWebsocket(final URI inputUri){
        Objects.requireNonNull(inputUri,"Input URI must not be null");
        String httpScheme = inputUri.getScheme();
        if ("ws".equalsIgnoreCase(httpScheme) || "wss".equalsIgnoreCase(httpScheme))
        {
            // keep as-is
            wsScheme = httpScheme;
        }
        else if ("http".equalsIgnoreCase(httpScheme))
        {
            // convert to ws
            wsScheme = "ws";
        }
        else if ("https".equalsIgnoreCase(httpScheme))
        {
            // convert to wss
            wsScheme = "wss";
        }
        else
        {
            throw new URISyntaxException(inputUri.toString(),"Unrecognized HTTP scheme");
        }
        return new URI(wsScheme,inputUri.getUserInfo(),inputUri.getHost(),inputUri.getPort(),inputUri.getPath(),inputUri.getQuery(),inputUri.getFragment());
}
}
//28
public class func{
	public void setContentLocation(URI contentURI){
    if (contentURI.getUserInfo() == null) {
      contentLocation = contentURI;
    } else {
      try {
        //strip out credential information
        contentLocation = new URI(contentURI.getScheme(), null, contentURI.getHost(), contentURI.getPort(), contentURI.getPath(), contentURI.getQuery(), contentURI.getFragment());
      } catch (URISyntaxException e) {
        //should never happen because we are stripping info from a valid URI
        throw new RuntimeException(e);
      }
    }
}
}
//29
public class func{
	public void stripUserInfoFromUriIfDefined(URI uri){
        if (uri.getUserInfo() != null) {
            try {
                uriToUse = new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        } else {
            uriToUse = uri;
        }
}
}
//30
public class func{
	public void toHTTP(URI uri){
    if (uri == null)
      return uri;
    String scheme = uri.getScheme();
    if (HTTP_SCHEME.equals(scheme) || HTTPS_SCHEME.equals(scheme))
      return uri;
    if (SyncUtils.READER_HTTPS_SCHEME.equals(scheme))
      newScheme = HTTPS_SCHEME;
      return new URI(newScheme, uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//31
public class func{
	public void createEndpoint(String uri,String remaining,Map<String,Object> parameters){
        URI httpUri = URISupport.createRemainingURI(
                new URI(uriHttpUriAddress.getScheme(),
                        uriHttpUriAddress.getUserInfo(),
                        uriHttpUriAddress.getHost(),
                        uriHttpUriAddress.getPort(),
                        uriHttpUriAddress.getPath(),
                        uriHttpUriAddress.getQuery(),
                        uriHttpUriAddress.getFragment()),
                        parameters);
        endpoint.setHttpUri(httpUri);
        if (headerFilterStrategy != null) {
            endpoint.setHeaderFilterStrategy(headerFilterStrategy);
        } else {
            setEndpointHeaderFilterStrategy(endpoint);
        }
        endpoint.setHttpBinding(getHttpBinding());
}
}
//32
public class func{
	public void getMessage(){
            sb.append(request.getMethod());
            sb.append(' ');
                final URI uri = request.getUri().toJavaNetURI();
                final String userInfo = uri.getUserInfo();
                if (userInfo != null) {
                    final Iterable<String> userSplitter = Splitter.on(':').trimResults().omitEmptyStrings().split(userInfo);
                    final Iterator<String> it = userSplitter.iterator();
                    if (it.hasNext()) {
                        username = it.next();
                    }
                }
                final URI cleanUri = new URI(uri.getScheme(), username, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                sb.append(cleanUri.toASCIIString());
                sb.append("invalid URL");
}
}
//33
public class func{
	public void BaseResource(URI uri,boolean rewrite){
    if (uri == null) {
      throw new IllegalArgumentException("uri must not be null");
    }
    if (rewrite && "localhost".equals(uri.getHost())) {
      // Rewrite localhost URIs to refer to the special Android emulator loopback passthrough interface.
      Logger.debug(LOG_TAG, "Rewriting " + uri + " to point to " + ANDROID_LOOPBACK_IP + ".");
      try {
        this.uri = new URI(uri.getScheme(), uri.getUserInfo(), ANDROID_LOOPBACK_IP, uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        Logger.error(LOG_TAG, "Got error rewriting URI for Android emulator.", e);
        throw new IllegalArgumentException("Invalid URI", e);
      }
    } else {
      this.uri = uri;
    }
}
}
//34
public class func{
	public void doProcess(Record record){
        addValue(record, "scheme", uri.getScheme());
        addValue(record, "authority", uri.getAuthority());
        addValue(record, "path", uri.getPath());
        addValue(record, "query", uri.getQuery());
        addValue(record, "fragment", uri.getFragment());
        addValue(record, "host", uri.getHost());
        addValue(record, "port", uri.getPort());
        addValue(record, "schemeSpecificPart", uri.getSchemeSpecificPart());
        addValue(record, "userInfo", uri.getUserInfo());
}
}
//35
public class func{
	public void doStart(){
        int port = getConnectorLocalPort(); 
        if (port == -1) {
            port = boundTo.getPort();
        }
        setConnectURI(new URI(boundTo.getScheme(),
                              boundTo.getUserInfo(),
                              boundTo.getHost(),
                              port,
                              boundTo.getPath(),
                              boundTo.getQuery(),
                              boundTo.getFragment()));
        LOG.info("Listening for connections at {}", getConnectURI());
}
}
//36
public class func{
	public void createConnection(){
        URI actualURI = connector.getServer().getConnectURI();
        URI connectURI = new URI(actualURI.getScheme(), actualURI.getUserInfo(), bindURI.getHost(), actualURI.getPort(), actualURI.getPath(), bindURI
                .getQuery(), bindURI.getFragment());
        Transport transport = TransportFactory.connect(connectURI);
        StubConnection connection = new StubConnection(transport);
        connections.add(connection);
}
}
//37
public class func{
	public void portUpdate(final URI uri){
      return port != uri.getPort( ) ?
        new URI( uri.getScheme( ), uri.getUserInfo( ), uri.getHost( ), port, uri.getPath( ), uri.getQuery( ), uri.getFragment( ) ) :
        uri;
}
}
//38
public class func{
	public void getCanonicalUri(URI uri,int defaultPort){
    String host = uri.getHost();
    if (host == null) {
      return uri;
    }
    String fqHost = canonicalizeHost(host);
    int port = uri.getPort();
    if (host.equals(fqHost) && port != -1) {
      return uri;
    }
      uri = new URI(uri.getScheme(), uri.getUserInfo(),
          fqHost, (port == -1) ? defaultPort : port,
          uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//39
public class func{
	public void canonicalizeUri(URI uri){
    if (uri.getPort() == -1 && getDefaultPort() > 0) {
      // reconstruct the uri with the default port set
      try {
        uri = new URI(uri.getScheme(), uri.getUserInfo(),
            uri.getHost(), getDefaultPort(),
            uri.getPath(), uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        // Should never happen!
        throw new AssertionError("Valid URI became unparseable: " +
            uri);
      }
    }
}
}
//40
public class func{
	public void assertCreateConnection(String uri){
        URI connectURI = new URI(temp.getScheme(), temp.getUserInfo(), temp.getHost(), currentURI.getPort(),
                                 temp.getPath(), temp.getQuery(), temp.getFragment());
        LOG.info("connection URI is: " + connectURI);
        ActiveMQXAConnectionFactory cf = new ActiveMQXAConnectionFactory(connectURI);
        Connection connection = cf.createConnection();
        assertXAConnection(connection);
        assertNotNull(connection);
        connection.close();
        connection = cf.createXAConnection();
        assertXAConnection(connection);
        assertNotNull(connection);
}
}
//41
public class func{
	public void valueOf(final java.net.URI uri){
        if( uri.isOpaque()) {
            // opaque, without host validation.
            // Note: This may induce encoding errors of authority and path, see {@link #PARSE_HINT_FIX_PATH}
            return new Uri(new Encoded( uri.toString() ), false, 0);
        } else {
            // with host validation if authority is defined
            return Uri.create(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                              uri.getPath(), uri.getQuery(), uri.getFragment());
        }
}
}
//42
public class func{
	public void testExtractURIComponents(){
    expected.put(prefix + "scheme", uri.getScheme());
    expected.put(prefix + "authority", uri.getAuthority());
    expected.put(prefix + "path", uri.getPath());
    expected.put(prefix + "query", uri.getQuery());
    expected.put(prefix + "fragment", uri.getFragment());
    expected.put(prefix + "host", uri.getHost());
    expected.put(prefix + "port", uri.getPort());
    expected.put(prefix + "schemeSpecificPart", uri.getSchemeSpecificPart());
    expected.put(prefix + "userInfo", uri.getUserInfo());
    processAndVerifySuccess(record, expected);
    record = new Record();
    record.put("uri", "invalidURI:");
    processAndVerifyFailure(record);
}
}
//43
public class func{
	public void statusToCommitLocation(URI u,String ref){
    String uriPath = u.getPath();
    String prefix = uriPath.substring(0, uriPath.indexOf(GitServlet.GIT_URI));
    uriPath = uriPath.substring(prefix.length() + (GitServlet.GIT_URI + '/' + Status.RESOURCE).length());
    return new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), uriPath, u.getQuery(), u.getFragment());
}
}
//44
public class func{
	public void resolveHostNameInUrl(DatacenterMO dcMo,String url){
                    URI resolvedUri = new URI(uri.getScheme(), uri.getUserInfo(), hostIp, uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                    s_logger.info("url " + url + " is resolved to " + resolvedUri.toString() + " through vCenter");
                    return resolvedUri.toString();
}
}
//45
public class func{
	public void statusToFileLocation(URI u){
    String uriPath = u.getPath();
    String prefix = uriPath.substring(0, uriPath.indexOf(GitServlet.GIT_URI));
    uriPath = uriPath.substring(prefix.length() + (GitServlet.GIT_URI + '/' + Status.RESOURCE).length());
    return new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), uriPath, u.getQuery(), u.getFragment());
}
}
//46
public class func{
	public void addQueryParameters(Map<String,Object> parameters,URI baseUrl){
      String newQuery = addQueryParameters(baseUrl.getQuery(), parameters);
      return new URI(baseUrl.getScheme(), baseUrl.getUserInfo(), baseUrl.getHost(), baseUrl.getPort(), baseUrl.getPath(), newQuery, baseUrl.getFragment());
      throw new UrlBuilderException(e);
}
}
//47
public class func{
	public void getLocalFileStore(HttpServletRequest request,ProjectInfo project){
              location = new URI(location.getScheme(), authString, location.getHost(), location.getPort(), location.getPath(), location.getQuery(), location.getFragment());
}
}
//48
public class func{
	public void testEncodingParts(){
        URI uri = new URI("http", "user:pa55w?rd", "host", 80, "/doc|search",
                "q=green robots", "over 6\"");
        assertEquals("http", uri.getScheme());
        assertEquals("user:pa55w?rd@host:80", uri.getAuthority());
        assertEquals("user:pa55w%3Frd@host:80", uri.getRawAuthority());
        assertEquals("user:pa55w?rd", uri.getUserInfo());
        assertEquals("user:pa55w%3Frd", uri.getRawUserInfo());
        assertEquals("/doc|search", uri.getPath());
        assertEquals("/doc%7Csearch", uri.getRawPath());
        assertEquals("q=green robots", uri.getQuery());
        assertEquals("q=green%20robots", uri.getRawQuery());
        assertEquals("over 6\"", uri.getFragment());
        assertEquals("over%206%22", uri.getRawFragment());
        assertEquals("//user:pa55w?rd@host:80/doc|search?q=green robots",
                uri.getSchemeSpecificPart());
        assertEquals("//user:pa55w%3Frd@host:80/doc%7Csearch?q=green%20robots",
                uri.getRawSchemeSpecificPart());
        assertEquals("http://user:pa55w%3Frd@host:80/doc%7Csearch?q=green%20robots#over%206%22",
                uri.toString());
}
}
//49
public class func{
	public void getUriWithPort(final URI uri,final int port){
        if (uri == null) {
            return null;
        }
            if (uri.getPort() == -1) {
                return new URI(
                        uri.getScheme(),
                        uri.getUserInfo(),
                        uri.getHost(),
                        port,
                        uri.getPath(),
                        uri.getQuery(),
                        uri.getFragment());
            }
            throw new RuntimeException("Could not parse URI.", e);
}
}
//50
public class func{
	public void buildUri(String relativePath){
        uri = new URI(uri.getScheme(), uri.getUserInfo(), host, uri.getPort(), uri.getPath(), uri.getQuery(),
            uri.getFragment());
}
}
//51
public class func{
	public void runTestCache(int port){
        URI uri2 = new URI(uri.getScheme(), uri.getUserInfo(),
            uri.getHost(), NameNode.DEFAULT_PORT, uri.getPath(),
            uri.getQuery(), uri.getFragment());  
        LOG.info("uri2=" + uri2);
        FileSystem fs = FileSystem.get(uri2, conf);
        checkPath(cluster, fs);
}
}
//52
public class func{
	public void getResolvedAddresses(String path){
                        uri = new URI(baseUri.getScheme(), baseUri.getUserInfo(), baseUri.getHost(), port, baseUri.getPath(), baseUri.getQuery(), baseUri.getFragment());
}
}
//53
public class func{
	public void checkContextForDifferentHostNamesRequests(){
    URI uri2 = new URI(uri1.getScheme(), uri1.getUserInfo(), "127.0.0.1", uri1.getPort(), uri1.getPath(), uri1.getQuery(), uri1.getFragment());
    HttpGet get2 = new HttpGet(uri2);
}
}
//54
public class func{
	public void run(String[] argv){
        URI fileSystem = FileSystem.getDefaultUri(getConf());
        URI dnProtocolURI = new URI(fileSystem.getScheme(), fileSystem
            .getUserInfo(), fileSystem.getHost(), dnPort, fileSystem.getPath(),
            fileSystem.getQuery(), fileSystem.getFragment());
        FileSystem.setDefaultUri(getConf(), dnProtocolURI);
}
}
//55
public class func{
	public void run(String[] argv){
        URI fileSystem = FileSystem.getDefaultUri(getConf());
        URI dnProtocolURI = new URI(fileSystem.getScheme(), fileSystem
            .getUserInfo(), fileSystem.getHost(), dnPort, fileSystem.getPath(),
            fileSystem.getQuery(), fileSystem.getFragment());
        FileSystem.setDefaultUri(getConf(), dnProtocolURI);
}
}
//56
public class func{
	public void doStart(){
        setConnectURI(new URI(boundTo.getScheme(),
                              boundTo.getUserInfo(),
                              boundTo.getHost(),
                              port,
                              boundTo.getPath(),
                              boundTo.getQuery(),
                              boundTo.getFragment()));
}
}
//57
public class func{
	public void urlFromSocket(URI uri,ServerSocket serverSocket){
    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(),
        listenPort, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//58
public class func{
	public void start(){
            throw new IOException("Failed to bind to server socket: " + bind + " due to: " + e, e);
            connectURI = new URI(bind.getScheme(), bind.getUserInfo(), bind.getHost(), serverSocket.getLocalPort(),
                    bind.getPath(), bind.getQuery(), bind.getFragment());
}
}
//59
public class func{
	public void fromUri(final URI uri,final HttpMethod method){
        int newPort = uri.getPort();
        if (newPort < 0) {
            try {
                newPort = uri.toURL().getDefaultPort();
            } catch (MalformedURLException e) {
                newPort = ANY_PORT;
            }
        }
        return new MatchInfo(uri.getScheme(), uri.getHost(), newPort, uri.getPath(), uri.getQuery(),
                uri.getFragment(), ANY_REALM, method);
}
}
//60
public class func{
	public void changeUserInformation(URI uri,String newUserInformation){
    return create(uri.getScheme(), newUserInformation, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//61
public class func{
	public void changePort(URI uri,int newPort){
    return create(uri.getScheme(), uri.getUserInfo(), uri.getHost(), newPort, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//62
public class func{
	public void handle(Socket sock,ToadletContainer container,PageMaker pageMaker,UserAlertManager userAlertManager,BookmarkManager bookmarkManager){
          if(logMINOR) Logger.minor(ToadletContextImpl.class, "URI: "+uri+" path "+uri.getPath()+" host "+uri.getHost()+" frag "+uri.getFragment()+" port "+uri.getPort()+" query "+uri.getQuery()+" scheme "+uri.getScheme());
          sendURIParseError(sock.getOutputStream(), true, e);
}
}
//63
public class func{
	public void changeHost(URI uri,String newHost){
    return create(uri.getScheme(), uri.getUserInfo(), newHost, uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//64
public class func{
	public void execute(TestParam values,ExecutionContext context){
            final URI uri = new URI("http://localhost:8080/path?query#fragment");
            final ClientHttpRequest request = values.clientHttpRequestFactory.createRequest(uri, HttpMethod.GET);
            final URI finalUri = request.getURI();
            assertEquals("http", finalUri.getScheme());
            assertEquals("localhost", finalUri.getHost());
            assertEquals("/path", finalUri.getPath());
            assertEquals(8080, finalUri.getPort());
            assertEquals("query", finalUri.getQuery());
            assertEquals("fragment", finalUri.getFragment());
            assertEquals(2, request.getHeaders().size());
            assertArrayEquals(new Object[]{"header1-v1", "header1-v2"}, request.getHeaders().get("header1").toArray());
            assertArrayEquals(new Object[]{"header2-value"}, request.getHeaders().get("header2").toArray());
}
}
//65
public class func{
	public void execute(TestParam values,ExecutionContext context){
            final URI uri = new URI("http://localhost:8080/path?query#fragment");
            final ClientHttpRequest request = values.clientHttpRequestFactory.createRequest(uri, HttpMethod.GET);
            final URI finalUri = request.getURI();
            assertEquals("http", finalUri.getScheme());
            assertEquals("127.0.0.1", finalUri.getHost());
            assertEquals("/path", finalUri.getPath());
            assertEquals(8080, finalUri.getPort());
            assertEquals("query", finalUri.getQuery());
            assertEquals("fragment", finalUri.getFragment());
}
}
//66
public class func{
	public void testUrl(){
      URI uri = new URI("sword://StrongsRealGreek/01909");
      assertEquals("sword", uri.getScheme());
      assertEquals("StrongsRealGreek", uri.getHost());
      assertEquals("/01909", uri.getPath());
      assertEquals("/01909", uri.getRawPath());
      assertEquals(null, uri.getQuery());
      assertEquals(null, uri.getFragment());
}
}
//67
public class func{
	public void execute(TestParam values,ExecutionContext context){
            final URI uri = new URI("https://localhost:8443/path?query#fragment");
            final ClientHttpRequest request = values.clientHttpRequestFactory.createRequest(uri, HttpMethod.GET);
            final URI finalUri = request.getURI();
            assertEquals("http", finalUri.getScheme());
            assertEquals("127.0.0.1", finalUri.getHost());
            assertEquals("/path", finalUri.getPath());
            assertEquals(9999, finalUri.getPort());
            assertEquals("query", finalUri.getQuery());
            assertEquals("fragment", finalUri.getFragment());
            assertEquals(1, request.getHeaders().size());
            assertArrayEquals(new Object[]{"value"}, request.getHeaders().get("header1").toArray());
}
}
//68
public class func{
	public void joinURI(String baseURI,String relativeURI){
        if (baseURI != null) {
            if (baseURI.endsWith("..")) {
                baseURI = baseURI + "/";
            }
            URI base = new URI(baseURI);
            bscheme = base.getScheme();
            bauthority = base.getAuthority();
            bpath = base.getPath();
            bquery = base.getQuery();
            bfragment = base.getFragment();
        }
}
}
//69
public class func{
	public void getTrashFileSystem(Configuration conf){
    conf = new Configuration(conf);
    InetSocketAddress serviceAddress = NameNode.getDNProtocolAddress(conf);
    if (serviceAddress != null) {
      URI defaultUri = FileSystem.getDefaultUri(conf);
      URI serviceUri = null;
      try {
        serviceUri = new URI(defaultUri.getScheme(), defaultUri.getUserInfo(),
            serviceAddress.getAddress().getHostAddress(), serviceAddress.getPort(),
            defaultUri.getPath(), defaultUri.getQuery(),
            defaultUri.getFragment());
      } catch (URISyntaxException uex) {
        throw new IOException("Failed to initialize a uri for trash FS");
      }
      Path trashFsPath = new Path(serviceUri.toString());
      return trashFsPath.getFileSystem(conf);
    } else {
      return FileSystem.get(conf);
    }
}
}
//70
public class func{
	public void bind(){
        URI boundUri = new URI(bind.getScheme(), bind.getUserInfo(), host, bindAddress.getPort(), bind.getPath(), bind.getQuery(), bind.getFragment());
        setConnectURI(boundUri);
}
}
//71
public class func{
	public void bind(){
            setConnectURI(new URI(bind.getScheme(), bind.getUserInfo(), resolveHostName(serverSocket, addr), serverSocket.getLocalPort(), bind.getPath(),
                bind.getQuery(), bind.getFragment()));
                setConnectURI(new URI(bind.getScheme(), bind.getUserInfo(), addr.getHostAddress(), serverSocket.getLocalPort(), bind.getPath(),
}
}
//72
public class func{
	public void relativize(URI uri){
      if (uri.getScheme() == null && uri.getHost() == null)
      {
         to = getBaseUriBuilder().replaceQuery(null).path(uri.getPath()).replaceQuery(uri.getQuery()).fragment(uri.getFragment()).build();
      }
      return ResteasyUriBuilder.relativize(from, to);
}
}
//73
public class func{
	public void resolve(URI uri){
    if (uri.isAbsolute())
      return uri;
    if (uri.isOpaque())
      return uri;
    String scheme = uri.getScheme();
    String schemeSpecificPart = uri.getSchemeSpecificPart();
    String authority = uri.getAuthority();
    String path = uri.getPath();
    String query = uri.getQuery();
    String fragment = uri.getFragment();
}
}
//74
public class func{
	public void fieldUpdate(String name,Result<V> repl,TypeStore store){
        if (!replType.isString()) {
          throw new UnexpectedType(getTypeFactory().stringType(), replType, ctx.getCurrentAST());
        }
        URI uri = URIUtil.createFromEncoded(newStringValue);
        scheme = uri.getScheme();
        authority = uri.getAuthority();
        path = uri.getPath();
        query = uri.getQuery();
        fragment = uri.getFragment();
}
}
//75
public class func{
	public void create(URI ref){
    return new URIRef(ref.getScheme(),ref.getAuthority(),ref.getPath(),ref.getQuery(),ref.getFragment());
}
}
//76
public class func{
	public void digestURI(final URI uri){
    this.scheme = uri.getScheme();
    this.encodedSchemeSpecificPart = uri.getRawSchemeSpecificPart();
    this.encodedAuthority = uri.getRawAuthority();
    this.host = uri.getHost();
    this.port = uri.getPort();
    this.encodedUserInfo = uri.getRawUserInfo();
    this.userInfo = uri.getUserInfo();
    this.encodedPath = uri.getRawPath();
    this.path = uri.getPath();
    this.queryParams = parseQuery(uri.getRawQuery(), Consts.UTF_8);
    this.encodedFragment = uri.getRawFragment();
    this.fragment = uri.getFragment();
}
}
//77
public class func{
	public void digestURI(final URI uri){
        this.scheme = uri.getScheme();
        this.encodedSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        this.encodedAuthority = uri.getRawAuthority();
        this.host = uri.getHost();
        this.port = uri.getPort();
        this.encodedUserInfo = uri.getRawUserInfo();
        this.userInfo = uri.getUserInfo();
        this.encodedPath = uri.getRawPath();
        this.path = uri.getPath();
        this.queryParams = parseQuery(uri.getRawQuery(), Consts.UTF_8);
        this.encodedFragment = uri.getRawFragment();
        this.fragment = uri.getFragment();
}
}
//78
public class func{
	public void testBuildFullValidFromEmpty(){
    URI result = classUnderTest.build();
    assertNotNull(result);
    assertEquals("scheme", result.getScheme());
    assertEquals("user:pass", result.getUserInfo());
    assertEquals("host.com", result.getHost());
    assertEquals(1000, result.getPort());
    assertEquals("/test/path/item.foo", result.getPath());
    assertTrue(result.getRawQuery().split("&").length == 2);
    assertTrue(result.getRawQuery().contains("param1=value1"));
    assertTrue(result.getRawQuery().contains("param2"));
    assertEquals("fragment", result.getFragment());
    assertEquals("scheme://user:pass@host.com:1000/test/path/item.foo?param1=value1&param2#fragment",
        result.toString());
}
}
//79
public class func{
	public void changeAuthority(URI uri,String newAuthority){
    return create(uri.getScheme(), newAuthority == null ? "" : newAuthority, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//80
public class func{
	public void test_ConstructorLjava_lang_StringLjava_lang_StringLjava_lang_StringILjava_lang_StringLjava_lang_StringLjava_lang_String(){
            uri = new URI("http", "us:e@r", "hostname", 85, "/file/dir#/qu?e/",
                    "qu?er#y", "frag#me?nt");
            assertEquals("wrong userinfo", "us:e@r", uri.getUserInfo());
            assertEquals("wrong hostname", "hostname", uri.getHost());
            assertEquals("wrong port number", 85, uri.getPort());
            assertEquals("wrong path", "/file/dir#/qu?e/", uri.getPath());
            assertEquals("wrong query", "qu?er#y", uri.getQuery());
            assertEquals("wrong fragment", "frag#me?nt", uri.getFragment());
            assertEquals("wrong SchemeSpecificPart",
                    "//us:e@r@hostname:85/file/dir#/qu?e/?qu?er#y", uri
                    .getSchemeSpecificPart());
            fail("Unexpected Exception: " + e);
}
}
//81
public class func{
	public void initialize(URI p_other){
    m_scheme = p_other.getScheme();
    m_userinfo = p_other.getUserinfo();
    m_host = p_other.getHost();
    m_port = p_other.getPort();
    m_path = p_other.getPath();
    m_queryString = p_other.getQueryString();
    m_fragment = p_other.getFragment();
}
}
//82
public class func{
	public void filterHttpRequest(SubmitContext context,HttpRequestInterface<?> request){
                java.net.URI oldUri = httpMethod.getURI();
                String pathToSet = StringUtils.hasContent(oldUri.getRawPath()) && !"/".equals(oldUri.getRawPath()) ? oldUri.getRawPath() + path : path;
                java.net.URI newUri = URIUtils.createURI(oldUri.getScheme(), oldUri.getHost(), oldUri.getPort(),
                        pathToSet, oldUri.getQuery(), oldUri.getFragment());
                httpMethod.setURI(newUri);
                context.setProperty(BaseHttpRequestTransport.REQUEST_URI, new URI(newUri.toString(), request
}
}
//83
public class func{
	public void fromUri(URI uri){
    Preconditions.checkArgument(uri.getScheme().equalsIgnoreCase(SCHEME),
        "URI: %s is not a GCS URI", uri);
    Preconditions.checkArgument(uri.getPort() == -1,
        "GCS URI may not specify port: %s (%i)", uri, uri.getPort());
    Preconditions.checkArgument(
        Strings.isNullOrEmpty(uri.getUserInfo()),
        "GCS URI may not specify userInfo: %s (%s)", uri, uri.getUserInfo());
    Preconditions.checkArgument(
        Strings.isNullOrEmpty(uri.getQuery()),
        "GCS URI may not specify query: %s (%s)", uri, uri.getQuery());
    Preconditions.checkArgument(
        Strings.isNullOrEmpty(uri.getFragment()),
        "GCS URI may not specify fragment: %s (%s)", uri, uri.getFragment());
    return fromUri(uri.toString());
}
}
//84
public class func{
	public void testFragmentOnly(){
        URI uri = new URI("http://host#fragment");
        assertEquals("host", uri.getHost());
        assertEquals("", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals("fragment", uri.getFragment());
}
}
//85
public class func{
	public void check(final URI argument){
            BUNDLE.checkArgumentPrintf(argument.isAbsolute(),
                "uriChecks.notAbsolute", argument);
            BUNDLE.checkArgumentPrintf(argument.getFragment() == null,
                "uriChecks.fragmentNotNull", argument);
            BUNDLE.checkArgumentPrintf(argument.getQuery() == null,
                "uriChecks.queryNotNull", argument);
            BUNDLE.checkArgumentPrintf(argument.getPath() != null,
                "uriChecks.noPath", argument);
            BUNDLE.checkArgumentPrintf(argument.getPath().endsWith("/"),
                "uriChecks.noEndingSlash", argument);
}
}
//86
public class func{
	public void testRelativeFragmentOnQuery(){
        URI base = new URI("http://host/file?query/x#fragment");
        URI uri = base.resolve("#another");
        assertEquals("http://host/file?query/x#another", uri.toString());
        assertEquals("/file", uri.getPath());
        assertEquals("query/x", uri.getQuery());
        assertEquals("another", uri.getFragment());
}
}
//87
public class func{
	public void changeQuery(URI uri,String newQuery){
    return create(uri.getScheme(), getCorrectAuthority(uri), uri.getPath(), newQuery, uri.getFragment());
}
}
//88
public class func{
	public void parseComposite(final URI uri){
        rc.scheme = uri.getScheme();
        final String ssp = stripPrefix(uri.getSchemeSpecificPart().trim(), "//").trim();
        parseComposite(uri, rc, ssp);
        rc.fragment = uri.getFragment();
}
}
//89
public class func{
	public void makeQualified(URI defaultUri,Path workingDir){
      path = new Path(workingDir, this);
    URI pathUri = path.toUri();
    String scheme = pathUri.getScheme();
    String authority = pathUri.getAuthority();
    String fragment = pathUri.getFragment();
}
}
//90
public class func{
	public void parse(String tag){
        check.state( ! t.contains("?"), "Cannot mix space and '?' style");
        URI u = URI.create(parts[0]);
        path = u.getPath();
        fragment = u.getFragment();
}
}
//91
public class func{
	public void parseComposite(URI uri){
        rc.scheme = uri.getScheme();
        String ssp = stripPrefix(uri.getRawSchemeSpecificPart().trim(), "//").trim();
        parseComposite(uri, rc, ssp);
        rc.fragment = uri.getFragment();
}
}
//92
public class func{
	public void compareURIs(URI uri1,URI uri2){
        assertEquals("Unexpected path", uri1.getPath(), uri2.getPath());
        assertEquals("Unexpected fragment", uri1.getFragment(), uri2.getFragment());
}
}
