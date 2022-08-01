//0
public class func{
	public void valideUri(URI uri){
    String schemeSpecificPart = uri.getSchemeSpecificPart();
    if (schemeSpecificPart.isEmpty()) {
      throw new IllegalArgumentException("scheme specific part must not be empty");
    }
    String host = uri.getHost();
    if (host != null) {
      throw new IllegalArgumentException("host must not be set");
    }
    String authority = uri.getAuthority();
    if (authority != null) {
      throw new IllegalArgumentException("authority must not be set");
    }
    String userInfo = uri.getUserInfo();
    if (userInfo != null) {
      throw new IllegalArgumentException("userInfo must not be set");
    }
    int port = uri.getPort();
    if (port != -1) {
      throw new IllegalArgumentException("port must not be set");
    }
    String path = uri.getPath();
    if (path != null) {
      throw new IllegalArgumentException("path must not be set");
    }
    String query = uri.getQuery();
    if (query != null) {
      throw new IllegalArgumentException("query must not be set");
    }
    String fragment = uri.getFragment();
    if (fragment != null) {
      throw new IllegalArgumentException("fragment must not be set");
    }
}
}
//1
public class func{
	public void fromUri(WindowsFileSystem fs,URI uri){
        if (!uri.isAbsolute())
            throw new IllegalArgumentException("URI is not absolute");
        if (uri.isOpaque())
            throw new IllegalArgumentException("URI is not hierarchical");
        String scheme = uri.getScheme();
        if ((scheme == null) || !scheme.equalsIgnoreCase("file"))
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        if (uri.getFragment() != null)
            throw new IllegalArgumentException("URI has a fragment component");
        if (uri.getQuery() != null)
            throw new IllegalArgumentException("URI has a query component");
        String path = uri.getPath();
        if (path.equals(""))
            throw new IllegalArgumentException("URI path component is empty");
        String auth = uri.getAuthority();
        if (auth != null && !auth.equals("")) {
            String host = uri.getHost();
            if (host == null)
                throw new IllegalArgumentException("URI authority component has undefined host");
            if (uri.getUserInfo() != null)
                throw new IllegalArgumentException("URI authority component has user-info");
            if (uri.getPort() != -1)
                throw new IllegalArgumentException("URI authority component has port number");

            // IPv6 literal
            // 1. drop enclosing brackets
            // 2. replace ":" with "-"
            // 3. replace "%" with "s" (zone/scopeID delimiter)
            // 4. Append .ivp6-literal.net
            if (host.startsWith("[")) {
                host = host.substring(1, host.length()-1)
                           .replace(':', '-')
                           .replace('%', 's');
                host += IPV6_LITERAL_SUFFIX;
            }

            // reconstitute the UNC
            path = "\\\\" + host + path;
        } else {
            if ((path.length() > 2) && (path.charAt(2) == ':')) {
                // "/c:/foo" --> "c:/foo"
                path = path.substring(1);
            }
        }
}
}
//2
public class func{
	public void uri(String uriTemplate){
        if (uri.getFragment() != null) {
            this.fragment = uri.getFragment();
        }
        if (uri.isOpaque()) {
            this.ssp = uri.getSchemeSpecificPart();
            this.scheme = uri.getScheme();
            return this;
        }
        if (uri.getScheme() == null && this.ssp != null && uri.getSchemeSpecificPart() != null) {
            // relative uri with ssp
            this.ssp = uri.getSchemeSpecificPart();
        } else {
            this.scheme = uri.getScheme();
        }
        if (uri.getAuthority() != null) {
            if (uri.getAuthority() == null && uri.getHost() == null && uri.getPort() == -1) {
                this.authority = uri.getAuthority();
                this.userInfo = null;
                this.host = null;
                this.port = null;
            } else {
                this.authority = null;
                if (uri.getUserInfo() != null) {
                    this.userInfo = uri.getUserInfo();
                }
                if (uri.getHost() != null) {
                    this.host = uri.getHost();
                }
                if (uri.getPort() != -1) {
                    this.port = Integer.toString(uri.getPort());
                }
            }

        }
        if (uri.getPath() != null) {
            this.path.setLength(0);
            this.path.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            this.query.setLength(0);
            this.query.append(uri.getQuery());
        }
}
}
//3
public class func{
	public void handleIncludeElement(XMLAttributes attributes){
        String acceptLanguage = attributes.getValue(XINCLUDE_ATTR_ACCEPT_LANGUAGE);
        if (parse == null) {
            parse = XINCLUDE_PARSE_XML;
        }
        if (href == null) {
            href = XMLSymbols.EMPTY_STRING;
        }
        if (href.length() == 0 && XINCLUDE_PARSE_XML.equals(parse)) {
            if (xpointer == null) {
                reportFatalError("XpointerMissing");
            }
            else {
                // When parse="xml" and an xpointer is specified treat
                // all absences of the href attribute as a resource error.
                Locale locale = (fErrorReporter != null) ? fErrorReporter.getLocale() : null;
                String reason = fXIncludeMessageFormatter.formatMessage(locale, "XPointerStreamability", null);
                reportResourceError("XMLResourceError", new Object[] { href, reason });
                return false;
            }
        }
            hrefURI = new URI(href, true);
            if (hrefURI.getFragment() != null) {
                reportFatalError("HrefFragmentIdentifierIllegal", new Object[] {href});
            }
            String newHref = escapeHref(href);
            if (href != newHref) {
                href = newHref;
                try {
                    hrefURI = new URI(href, true);
                    if (hrefURI.getFragment() != null) {
                        reportFatalError("HrefFragmentIdentifierIllegal", new Object[] {href});
                    }
                }
                catch (URI.MalformedURIException exc2) {
                    reportFatalError("HrefSyntacticallyInvalid", new Object[] {href});
                }
            }
            else {
                reportFatalError("HrefSyntacticallyInvalid", new Object[] {href});
            }
        if (accept != null && !isValidInHTTPHeader(accept)) {
            reportFatalError("AcceptMalformed", null);
            accept = null;
        }
        if (acceptLanguage != null && !isValidInHTTPHeader(acceptLanguage)) {
            reportFatalError("AcceptLanguageMalformed", null);
            acceptLanguage = null;
        }
}
}
//4
public class func{
	public void requestAuthorization(String scope,String responseType,String clientId,String redirectUri,String state,String respMode,String nonce,String display,String prompt,Integer maxAge,String uiLocalesStr,String idTokenHint,String loginHint,String acrValuesStr,String amrValuesStr,String request,String requestUri,String requestSessionId,String sessionId,String accessToken,String method,String originHeaders,HttpServletRequest httpRequest,HttpServletResponse httpResponse,SecurityContext securityContext){
                            if (StringUtils.isNotBlank(accessToken)) {
                                AuthorizationGrant authorizationGrant = authorizationGrantList.getAuthorizationGrantByAccessToken(accessToken);

                                if (authorizationGrant == null) {
                                    RedirectUri redirectUriResponse = new RedirectUri(redirectUri, responseTypes, responseMode);
                                    redirectUriResponse.parseQueryString(errorResponseFactory.getErrorAsQueryString(
                                            AuthorizeErrorResponseType.ACCESS_DENIED, state));

                                    builder = RedirectUtil.getRedirectResponseBuilder(redirectUriResponse.toString(), httpRequest);
                                    return builder.build();
                                } else {
                                    user = userService.getUser(authorizationGrant.getUserId());
                                    sessionUser = sessionIdService.generateAuthenticatedSessionId(user.getDn(), prompt);
                                }
                            }
                            if (StringUtils.isNotBlank(requestUri)) {
                                boolean validRequestUri = false;
                                try {
                                    URI reqUri = new URI(requestUri);
                                    String reqUriHash = reqUri.getFragment();
                                    String reqUriWithoutFragment = reqUri.getScheme() + ":" + reqUri.getSchemeSpecificPart();

                                    ClientRequest clientRequest = new ClientRequest(reqUriWithoutFragment);
                                    clientRequest.setHttpMethod(HttpMethod.GET);

                                    ClientResponse<String> clientResponse = clientRequest.get(String.class);
                                    int status = clientResponse.getStatus();

                                    if (status == 200) {
                                        request = clientResponse.getEntity(String.class);

                                        if (StringUtils.isBlank(reqUriHash)) {
                                            validRequestUri = true;
                                        } else {
                                            String hash = JwtUtil.base64urlencode(JwtUtil.getMessageDigestSHA256(request));
                                            validRequestUri = StringUtils.equals(reqUriHash, hash);
                                        }
                                    }

                                    if (validRequestUri) {
                                        requestUri = null;
                                    } else {
                                        RedirectUri redirectUriResponse = new RedirectUri(redirectUri, responseTypes, responseMode);
                                        redirectUriResponse.parseQueryString(errorResponseFactory.getErrorAsQueryString(
                                                AuthorizeErrorResponseType.INVALID_REQUEST_URI, state));

                                        builder = RedirectUtil.getRedirectResponseBuilder(redirectUriResponse.toString(), httpRequest);
                                        return builder.build();
                                    }
                                } catch (URISyntaxException e) {
                                    log.error(e.getMessage(), e);
                                } catch (UnknownHostException e) {
                                    log.error(e.getMessage(), e);
                                } catch (ConnectException e) {
                                    log.error(e.getMessage(), e);
                                } catch (Exception e) {
                                    log.error(e.getMessage(), e);
                                }
                            }
                            if (StringUtils.isNotBlank(request)) {
                                try {
                                    jwtAuthorizationRequest = new JwtAuthorizationRequest(request, client);

                                    if (!jwtAuthorizationRequest.getResponseTypes().containsAll(responseTypes)
                                            || !responseTypes.containsAll(jwtAuthorizationRequest.getResponseTypes())) {
                                        throw new InvalidJwtException("The responseType parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getClientId() != null
                                            && !jwtAuthorizationRequest.getClientId().equals(clientId)) {
                                        throw new InvalidJwtException("The clientId parameter is not the same in the JWT");
                                    } else if (!jwtAuthorizationRequest.getScopes().containsAll(scopes)
                                            || !scopes.containsAll(jwtAuthorizationRequest.getScopes())) {
                                        throw new InvalidJwtException("The scope parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getRedirectUri() != null
                                            && !jwtAuthorizationRequest.getRedirectUri().equals(redirectUri)) {
                                        throw new InvalidJwtException("The redirectUri parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getState() != null && StringUtils.isNotBlank(state)
                                            && !jwtAuthorizationRequest.getState().equals(state)) {
                                        throw new InvalidJwtException("The state parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getNonce() != null && StringUtils.isNotBlank(nonce)
                                            && !jwtAuthorizationRequest.getNonce().equals(nonce)) {
                                        throw new InvalidJwtException("The nonce parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getDisplay() != null && StringUtils.isNotBlank(display)
                                            && !jwtAuthorizationRequest.getDisplay().getParamName().equals(display)) {
                                        throw new InvalidJwtException("The display parameter is not the same in the JWT");
                                    } else if (!jwtAuthorizationRequest.getPrompts().isEmpty() && !prompts.isEmpty()
                                            && !jwtAuthorizationRequest.getPrompts().containsAll(prompts)) {
                                        throw new InvalidJwtException("The prompt parameter is not the same in the JWT");
                                    } else if (jwtAuthorizationRequest.getIdTokenMember() != null
                                            && jwtAuthorizationRequest.getIdTokenMember().getMaxAge() != null && maxAge != null
                                            && !jwtAuthorizationRequest.getIdTokenMember().getMaxAge().equals(maxAge)) {
                                        throw new InvalidJwtException("The maxAge parameter is not the same in the JWT");
                                    }
                                } catch (InvalidJwtException e) {
                                    invalidOpenidRequestObject = true;
                                    log.debug("Invalid JWT authorization request. Exception = {0}, Message = {1}", e,
                                            e.getClass().getName(), e.getMessage());
                                } catch (Exception e) {
                                    invalidOpenidRequestObject = true;
                                    log.debug("Invalid JWT authorization request. Exception = {0}, Message = {1}", e,
                                            e.getClass().getName(), e.getMessage());
                                }
                            }
}
}
//5
public class func{
	public void crs(Node node){
        if (node.getAttribute("srsName") != null) {
            URI srs = null;
            Object raw = node.getAttributeValue("srsName");

            if (raw instanceof URI) {
                srs = (URI) raw;
            } else if (raw instanceof String) {
                //try to parse into a uri
                try {
                    srs = new URI((String) raw);
                } catch (URISyntaxException e) {
                    //failed, continue on
                }
            }

            if (srs != null) {
                //TODO: JD, this is a hack until GEOT-1136 has been resolved
                if ("http".equals(srs.getScheme()) && "www.opengis.net".equals(srs.getAuthority())
                        && "/gml/srs/epsg.xml".equals(srs.getPath()) && (srs.getFragment() != null)) {
                    try {
                        return CRS.decode("EPSG:" + srs.getFragment());
                    } catch (Exception e) {
                        //failed, try as straight up uri
                        try {
                            return CRS.decode(srs.toString());
                        } catch (Exception e1) {
                            //failed again, do nothing ,should fail below as well
                        }
                    }
                }
            }

            try {
                return CRS.decode(raw.toString());
            } catch (NoSuchAuthorityCodeException e) {
                // HACK HACK HACK!: remove when
                // http://jira.codehaus.org/browse/GEOT-1659 is fixed
                final String crs = raw.toString();
                if (crs.toUpperCase().startsWith("URN")) {
                    String code = crs.substring(crs.lastIndexOf(":") + 1);
                    try {
                        return CRS.decode("EPSG:" + code);
                    } catch (Exception e1) {
                        throw new RuntimeException("Could not create crs: " + srs, e);
                    }
                }
            } catch (FactoryException e) {
                throw new RuntimeException("Could not create crs: " + srs, e);
            }
        }
}
}
//6
public class func{
	public void getAbsoluteFile(final MapModel map,final URI uri){
    if(uri == null) {
      return null;
    }    
    if (uri.getFragment() != null) {
      return null;
    }
      if(Compat.isWindowsOS() && (uri.getScheme() != null && uri.getScheme().length() == 1)) { 
        urlConnection = (new File(uri.toString())).toURI().toURL().openConnection();
      } 
      else if(uri.getScheme() == null && !uri.getPath().startsWith(File.separator)) {
        if(map == null) {
          urlConnection = (new File(uri.toString())).toURI().toURL().openConnection();
        } 
        else {
          urlConnection = getAbsoluteUri(map, uri).toURL().openConnection();
        }
      }
      else {
        urlConnection = uri.toURL().openConnection();        
      }
      if (urlConnection == null) {
        return null;
      }
      else {
        URL url = urlConnection.getURL();
        URI absoluteUri = url.toURI();
        if("file".equalsIgnoreCase(absoluteUri.getScheme())) {
          File file = new File(absoluteUri);
          try {
            file = file.getCanonicalFile();
          }
          catch(IOException ignore) {
            LogUtils.info("Exception in org.freeplane.plugin.workspace.mindmapmode.MModeWorkspaceUrlManager.getAbsoluteFile(map, uri) while canonicalizing the file " + file);
            //can be ignored because it's just done to clear the path of unnecessary slashes etc.
          }
          return file;
        }        
      }
      LogUtils.warn(e);
      LogUtils.warn(e);
      LogUtils.warn(e);
}
}
//7
public class func{
	public void main(String args[]){
            boolean schemeCheck = scheme == null? url.getProtocol() == null :
                scheme.equals(url.getProtocol());
            if (!schemeCheck)
                throw new RuntimeException("uri.scheme is " + scheme +
                                           " url.protocol is " +
                                           url.getProtocol());
            if (uri.isOpaque()) {
                String ssp = uri.getSchemeSpecificPart();
                boolean sspCheck = ssp == null? uri.getPath() == null :
                    ssp.equals(url.getPath());
                if (!sspCheck) {
                    throw new RuntimeException("uri.ssp is " + ssp +
                                           " url.path is " + url.getPath());
                }
            } else {
                String authority = uri.getAuthority();
                boolean authorityCheck = authority == null?
                    url.getAuthority() == null :
                    authority.equals(url.getAuthority());
                if (!authorityCheck) {
                    throw new RuntimeException("uri.authority is " +
                                               authority + " url's is " +
                                               url.getAuthority());
                }
                String host = uri.getHost();
                boolean hostCheck = host == null ? url.getHost() == null :
                    host.equals(url.getHost());
                if (!hostCheck)
                    throw new RuntimeException("uri.host is " +
                                               host + " url's is " +
                                               url.getHost());
                if (host != null) {
                    String userInfo = uri.getUserInfo();
                    boolean userInfoCheck = userInfo == null?
                        url.getUserInfo() == null :
                        userInfo.equals(url.getUserInfo());
                    if (uri.getPort() != url.getPort())
                        throw new RuntimeException("uri.port is " +
                                               uri.getPort() + " url's is " +
                                               url.getPort());
                }

                String path = uri.getPath();
                boolean pathCheck = path == null? url.getPath() == null :
                    path.equals(url.getPath());
                if (!pathCheck)
                    throw new RuntimeException("uri.path is " + path +
                                               " url.path is " +
                                               url.getPath());
                String query = uri.getQuery();
                boolean queryCheck = query == null? url.getQuery() == null :
                    query.equals(url.getQuery());
                if (!queryCheck)
                    throw new RuntimeException("uri.query is " + query +
                                               " url.query is " +
                                               url.getQuery());
            }
            String frag = uri.getFragment();
            boolean fragCheck = frag == null? url.getRef() == null :
            frag.equals(url.getRef());
}
}
//8
public class func{
	public void File(URI uri){
        if (!uri.isAbsolute())
            throw new IllegalArgumentException("URI is not absolute");
        if (uri.isOpaque())
            throw new IllegalArgumentException("URI is not hierarchical");
        String scheme = uri.getScheme();
        if ((scheme == null) || !scheme.equalsIgnoreCase("file"))
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        if (uri.getAuthority() != null)
            throw new IllegalArgumentException("URI has an authority component");
        if (uri.getFragment() != null)
            throw new IllegalArgumentException("URI has a fragment component");
        if (uri.getQuery() != null)
            throw new IllegalArgumentException("URI has a query component");
        String p = uri.getPath();
        if (p.equals(""))
            throw new IllegalArgumentException("URI path component is empty");
        p = fs.fromURIPath(p);
}
}
//9
public class func{
	public void getAbsoluteUrl(final URI base,final URI uri){
    final String path = uri.isOpaque() ? uri.getSchemeSpecificPart() : uri.getRawPath();
    final StringBuilder sb = new StringBuilder(path);
    final String query = uri.getQuery();
    if (query != null) {
      sb.append('?');
      sb.append(query);
    }
    final String fragment = uri.getFragment();
    if (fragment != null) {
      sb.append('#');
      sb.append(fragment);
    }
    final String scheme = uri.getScheme();
    if("file".equals(scheme)) {
      if(sb.toString().startsWith("//") && !sb.toString().startsWith("////")) {
        sb.insert(0, "//");
      }
    }
    if (!uri.isAbsolute() || uri.isOpaque() || uri.getScheme().length()>0) {
      final URL baseUrl = base.toURL();
      if (scheme == null || baseUrl.getProtocol().equals(scheme)) {
        final URL url = new URL(baseUrl, sb.toString());
        return url;
      }
    }
    final URL url = new URL(uri.getScheme(), uri.getHost(), uri.getPort(), sb.toString());
}
}
//10
public class func{
	public void getMatchingPartitions(String graphId,URI locationToMatch){
    for (Map.Entry<Integer, URI> entry : _sliceMappings.get(graphId).entrySet()) {
      URI test = entry.getValue();

      // test scheme, userinfo, host, port, query, fragment
      if (scheme != null && !scheme.equalsIgnoreCase(test.getScheme())) {
        continue;
      }
      if (userinfo != null && !userinfo.equals(test.getUserInfo())) {
        continue;
      }
      if (host != null && !host.equals(test.getHost())) {
        continue;
      }
      if (port != -1 && port != test.getPort()) {
        continue;
      }
      if (query != null && !query.equals(test.getQuery())) {
        continue;
      }
      if (fragment != null && !fragment.equals(test.getFragment())) {
        continue;
      }

      // test path
      if (path != null) {
        if (test.getPath() == null) {
          continue;
        }

        URI testPath = URI.create(test.getPath());
        if (path.relativize(testPath) == testPath) {
          continue;
        }
      }

      // all tests passed, return mapping
      matchingPartitions.add(entry.getKey());
    }
}
}
//11
public class func{
	public void safeRelativize(final URI baseURI,final URI toUri){
        for (; m < basePath.length(); m++) {
            if (m >= toPath.length()) {
                if (basePath.charAt(m) == '/') {
                    ellipsesCount++;
                }
            }
            else {
                if (basePath.charAt(m) != toPath.charAt(m)) {
                    break;
                }
                else if (basePath.charAt(m) == '/') {
                    truncatePtr = m + 1;
                }
            }
        }
        if (m < toPath.length() && toPath.charAt(m) == '/') {
            // this is to handle the empty directory case with the '/' delimiter
            // for example, ../containername/ and ../containername// should not increment the truncatePtr
            if (!(toPath.charAt(m - 1) == '/' && basePath.charAt(m - 1) == '/')) {
                truncatePtr = m + 1;
            }
        }
        if (m == toPath.length()) {
            // No path difference, return query + fragment
            return new URI(null, null, null, toUri.getQuery(), toUri.getFragment()).toString();
        }
        else {
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
//12
public class func{
	public void checkUri(URI uri){
        if (!uri.getScheme().equalsIgnoreCase(getScheme()))
            throw new IllegalArgumentException("URI does not match this provider");
        if (uri.getAuthority() != null)
            throw new IllegalArgumentException("Authority component present");
        if (uri.getPath() == null)
            throw new IllegalArgumentException("Path component is undefined");
        if (!uri.getPath().equals("/"))
            throw new IllegalArgumentException("Path component should be '/'");
        if (uri.getQuery() != null)
            throw new IllegalArgumentException("Query component present");
        if (uri.getFragment() != null)
            throw new IllegalArgumentException("Fragment component present");
}
}
//13
public class func{
	public void parseURL(String uri){
    String sessVars = jdbcURI.getPath();
    if ((sessVars != null) && !sessVars.isEmpty()) {
      String dbName = "";
      // removing leading '/' returned by getPath()
      sessVars = sessVars.substring(1);
      if (!sessVars.contains(";")) {
        // only dbname is provided
        dbName = sessVars;
      } else {
        // we have dbname followed by session parameters
        dbName = sessVars.substring(0, sessVars.indexOf(';'));
        sessVars = sessVars.substring(sessVars.indexOf(';') + 1);
        if (sessVars != null) {
          Matcher sessMatcher = pattern.matcher(sessVars);
          while (sessMatcher.find()) {
            if (connParams.getSessionVars().put(sessMatcher.group(1), sessMatcher.group(2)) != null) {
              throw new JdbcUriParseException("Bad URL format: Multiple values for property "
                  + sessMatcher.group(1));
            }
          }
        }
      }
      if (!dbName.isEmpty()) {
        connParams.setDbName(dbName);
      }
    }
    String confStr = jdbcURI.getQuery();
    if (confStr != null) {
      Matcher confMatcher = pattern.matcher(confStr);
      while (confMatcher.find()) {
        connParams.getHiveConfs().put(confMatcher.group(1), confMatcher.group(2));
      }
    }
    String varStr = jdbcURI.getFragment();
    if (varStr != null) {
      Matcher varMatcher = pattern.matcher(varStr);
      while (varMatcher.find()) {
        connParams.getHiveVars().put(varMatcher.group(1), varMatcher.group(2));
      }
    }
    handleParamDeprecation(connParams.getSessionVars(), connParams.getSessionVars(),
        JdbcConnectionParams.AUTH_QOP_DEPRECATED, JdbcConnectionParams.AUTH_QOP, newUsage);
    handleParamDeprecation(connParams.getHiveConfs(), connParams.getSessionVars(),
        JdbcConnectionParams.TRANSPORT_MODE_DEPRECATED, JdbcConnectionParams.TRANSPORT_MODE,
        newUsage);
    handleParamDeprecation(connParams.getHiveConfs(), connParams.getSessionVars(),
        JdbcConnectionParams.HTTP_PATH_DEPRECATED, JdbcConnectionParams.HTTP_PATH, newUsage);
    if (connParams.isEmbeddedMode()) {
      // In case of embedded mode we were supplied with an empty authority.
      // So we never substituted the authority with a dummy one.
      connParams.setHost(jdbcURI.getHost());
      connParams.setPort(jdbcURI.getPort());
    } else {
      // Else substitute the dummy authority with a resolved one.
      // In case of dynamic service discovery using ZooKeeper, it picks a server uri from ZooKeeper
      String resolvedAuthorityString = resolveAuthority(connParams);
      LOG.info("Resolved authority: " + resolvedAuthorityString);
      uri = uri.replace(dummyAuthorityString, resolvedAuthorityString);
      connParams.setJdbcUriString(uri);
      // Create a Java URI from the resolved URI for extracting the host/port
      URI resolvedAuthorityURI = null;
      try {
        resolvedAuthorityURI = new URI(null, resolvedAuthorityString, null, null, null);
      } catch (URISyntaxException e) {
        throw new JdbcUriParseException("Bad URL format: ", e);
      }
      connParams.setHost(resolvedAuthorityURI.getHost());
      connParams.setPort(resolvedAuthorityURI.getPort());
    }
}
}
//14
public class func{
	public void setUriParts(URI uri){
        if (uri == null) {
            throw new IllegalArgumentException("uri is null");
        }
        String theScheme = uri.getScheme();
        if (theScheme != null) {
            scheme = theScheme;
        }
        String rawPath = uri.getRawPath();
        if (!uri.isOpaque() 
            && (theScheme != null || rawPath != null && rawPath.startsWith("/"))) {
            port = uri.getPort();
            host = uri.getHost();
            if (rawPath != null) {
                setPathAndMatrix(rawPath);
            }
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null) {
                query = JAXRSUtils.getStructuredParams(rawQuery, "&", false, true);
            }
            userInfo = uri.getUserInfo();
            schemeSpecificPart = null;
        } else {
            schemeSpecificPart = uri.getSchemeSpecificPart();
        }
        String theFragment = uri.getFragment();
        if (theFragment != null) {
            fragment = theFragment;
        }
}
}
//15
public class func{
	public void getAbsoluteUrl(final MapModel map,final URI uri){
    final String path = uri.isOpaque() ? uri.getSchemeSpecificPart() : uri.getPath();
    final StringBuilder sb = new StringBuilder(path);
    final String query = uri.getQuery();
    if (query != null) {
      sb.append('?');
      sb.append(query);
    }
    final String fragment = uri.getFragment();
    if (fragment != null) {
      sb.append('#');
      sb.append(fragment);
    }
    if (!uri.isAbsolute() || uri.isOpaque() || uri.getScheme().length()>0) {
      final URL mapUrl = map.getURL();
      final String scheme = uri.getScheme();
      if (scheme == null || mapUrl.getProtocol().equals(scheme)) {
        final URL url = new URL(mapUrl, sb.toString());
        return url;
      }
    }
    final URL url = new URL(uri.getScheme(), uri.getHost(), uri.getPort(), sb.toString());
}
}
//16
public class func{
	public void fieldUpdate(String name,Result<V> repl,TypeStore store){
        if (replType.isString()) {
          URI uri = URIUtil.assumeCorrect(newStringValue);
          scheme = uri.getScheme();
          authority = uri.getAuthority();
          path = uri.getPath();
          query = uri.getQuery();
          fragment = uri.getFragment();
        }
        else if (replType.isSourceLocation()) {
          ISourceLocation rep = ((ISourceLocation) repl.getValue());
          scheme = rep.getScheme();
          authority = rep.hasAuthority() ? rep.getAuthority() : null;
          path = rep.hasPath() ? rep.getPath() : null;
          query = rep.hasQuery() ? rep.getQuery() : null;
          fragment = rep.hasFragment() ? rep.getFragment() : null;
        }
        else {
          throw new UnexpectedType(getTypeFactory().stringType(), replType, ctx.getCurrentAST());
        }
}
}
//17
public class func{
	public void getLocalFile(URI remoteUri){
      String host = remoteUri.getHost();
      String query = remoteUri.getQuery();
      String path = remoteUri.getPath();
      String fragment = remoteUri.getFragment();
    if (host != null)
    {
      sb.append(host);
    }
    if (path != null)
    {
      sb.append(path);
    }
    if (query != null)
    {
      sb.append('?');
      sb.append(query);
    }
    if (fragment != null)
    {
      sb.append('#');
      sb.append(fragment);
    }
    if (sb.length() < maxLen)
    {
      name = sb.toString();
    }
    else
    {
      name = sb.substring(0, maxLen);
    }
    name = name.replace('"', '$');
    File f = new File(cacheDir, name);
}
}
//18
public class func{
	public void loadURL(URI uri){
    final String uriString = uri.toString();
    if (uriString.startsWith("#")) {
      final String target = uri.getFragment();
      try {
        final ModeController modeController = Controller.getCurrentModeController();
        final MapController mapController = modeController.getMapController();
        final NodeModel node = mapController.getNodeFromID(target);
        if (node != null) {
          mapController.select(node);
        }
      }
      catch (final Exception e) {
        LogUtils.warn("link " + target + " not found", e);
        UITools.errorMessage(TextUtils.format("link_not_found", target));
      }
      return;
    }
      final String extension = FileUtils.getExtension(uri.getRawPath());
      if(! uri.isAbsolute()){
        uri = getAbsoluteUri(uri);
        if(uri == null){
          UITools.errorMessage(TextUtils.getText("map_not_saved"));
          return;
        }
      }
      if(!"file".equals(uri.getScheme())) {
        try {
          uri = uri.toURL().openConnection().getURL().toURI().normalize();
        }
        catch (Exception e) {
          LogUtils.warn("link " + uri + " not found", e);
          UITools.errorMessage(TextUtils.format("link_not_found", uri.toString()));
        }
      }
}
}
//19
public class func{
	public void absolutize(URI p_base){
      if (m_path.length() == 0 && m_scheme == null &&
          m_host == null && m_regAuthority == null) {
          m_scheme = p_base.getScheme();
          m_userinfo = p_base.getUserinfo();
          m_host = p_base.getHost();
          m_port = p_base.getPort();
          m_regAuthority = p_base.getRegBasedAuthority();
          m_path = p_base.getPath();

          if (m_queryString == null) {
              m_queryString = p_base.getQueryString();

              if (m_fragment == null) {
                  m_fragment = p_base.getFragment();
              }
          }
          return;
      }
      if (m_scheme == null) {
          m_scheme = p_base.getScheme();
      }
      else {
          return;
      }
      if (m_host == null && m_regAuthority == null) {
          m_userinfo = p_base.getUserinfo();
          m_host = p_base.getHost();
          m_port = p_base.getPort();
          m_regAuthority = p_base.getRegBasedAuthority();
      }
      else {
          return;
      }
}
}
//20
public class func{
	public void upOne(URI uri){
        String tmpstr = uri.toString();
        String frag = uri.getFragment();
        if (frag != null && !frag.isEmpty()) index = tmpstr.length() - frag.length() - 1;
        else {// Strip the query
            frag = uri.getQuery();
            if (frag != null && !frag.isEmpty()) index = tmpstr.length() - frag.length() - 1;
            else { // Strip the slash part
                frag = uri.getPath();
                if (frag != null && !frag.isEmpty()) {
                    int i = frag.lastIndexOf('/');
                    boolean trimslash = false;
                    // If it ends with a slash, remove that too
                    if (i == frag.length() - 1) {
                        trimslash = true;
                        frag = frag.substring(0, i);
                    }
                    index = tmpstr.length() - frag.length() + frag.lastIndexOf('/') + (trimslash ? -1 : 0);
                }
            }
        }
        if (index >= 0) return IRI.create(tmpstr.substring(0, index));
        else return IRI.create(uri);
}
}
//21
public class func{
	public void addShareLib(Configuration conf,String[] actionShareLibNames){
                    for (String actionShareLibName : actionShareLibNames) {
                        List<Path> listOfPaths = shareLibService.getShareLibJars(actionShareLibName);
                        if (listOfPaths != null && !listOfPaths.isEmpty()) {
                            for (Path actionLibPath : listOfPaths) {
                                String fragmentName = new URI(actionLibPath.toString()).getFragment();
                                Path pathWithFragment = fragmentName == null ? actionLibPath : new Path(new URI(
                                        actionLibPath.toString()).getPath());
                                String fileName = fragmentName == null ? actionLibPath.getName() : fragmentName;
                                if (confSet.contains(fileName)) {
                                    Configuration jobXmlConf = shareLibService.getShareLibConf(actionShareLibName,
                                            pathWithFragment);
                                    checkForDisallowedProps(jobXmlConf, actionLibPath.getName());
                                    XConfiguration.injectDefaults(jobXmlConf, conf);
                                    LOG.trace("Adding properties of " + actionLibPath + " to job conf");
                                }
                                else {
                                    // Filtering out duplicate jars or files
                                    sharelibList.add(new Path(actionLibPath.toUri()) {
                                        @Override
                                        public int hashCode() {
                                            return getName().hashCode();
                                        }
                                        @Override
                                        public String getName() {
                                            try {
                                                return (new URI(toString())).getFragment() == null ? new Path(toUri()).getName()
                                                        : (new URI(toString())).getFragment();
                                            }
                                            catch (URISyntaxException e) {
                                                throw new RuntimeException(e);
                                            }
                                        }
                                        @Override
                                        public boolean equals(Object input) {
                                            if (input == null) {
                                                return false;
                                            }
                                            if (input == this) {
                                                return true;
                                            }
                                            if (!(input instanceof Path)) {
                                                return false;
                                            }
                                            return getName().equals(((Path) input).getName());
                                        }
                                    });
                                }
                            }
                        }
                    }
                for (Path libPath : sharelibList) {
                    addToCache(conf, libPath, libPath.toUri().getPath(), false);
                }
}
}
//22
public class func{
	public void getMatch(URI uri){
      if (!uri.isOpaque()) {
        return null;
      }
      Iterator<String> pathQuery = PATH_QUERY_SPLITTER
          .split(uri.getRawSchemeSpecificPart()).iterator();
      if (!addPath(patternPath, Iterators.getNext(pathQuery, null), result)) {
        return null;
      }
      addQuery(Iterators.getNext(pathQuery, null), result);
    } else if (!uri.isOpaque()) {
      addAuthority(uri, result);

      if (patternPath.isEmpty() && !uri.getRawPath().isEmpty()) {
        return null;
      }

      if (!addPath(patternPath, uri.getRawPath(), result)) {
        return null;
      }

      addQuery(uri.getRawQuery(), result);

    } else {
      return null;
    }
    if (!addComplexMatch(pattern.getFragment(), uri.getFragment(), result)) {
}
}
//23
public class func{
	public void setBaseURI(String uri){
    if (uri == null || uri.equals("")) {
      element.removeAttribute("base", org.jdom.Namespace.XML_NAMESPACE);
      return;
    }
    String error = org.jdom.Verifier.checkURI(uri);
    if (error != null) {
      throw new MalformedURIException(error);
    }
      URI uriObject = new URI(uri);
      if (uriObject.getFragment() != null) {
        throw new MalformedURIException(
            "no fragments allows in base URIs");
      }
      if (!uriObject.isAbsolute()) {
        throw new MalformedURIException("base URIs should be absolute.");
      }
        element.setAttribute("base", uriObject.toASCIIString(),
            org.jdom.Namespace.XML_NAMESPACE);
      throw new MalformedURIException(e, uri);
}
}
//24
public class func{
	public void loadURL(URI uri){
    final String uriString = uri.toString();
    if (uriString.startsWith("#")) {
      final String target = uri.getFragment();
      try {
        final ModeController modeController = Controller.getCurrentModeController();
        final MapController mapController = modeController.getMapController();
        final NodeModel node = mapController.getNodeFromID(target);
        if (node != null) {
          mapController.select(node);
        }
      }
      catch (final Exception e) {
        LogUtils.warn("link " + target + " not found", e);
        UITools.errorMessage(TextUtils.format("link_not_found", target));
      }
      return;
    }
      final String extension = FileUtils.getExtension(uri.getRawPath());
      if(! uri.isAbsolute()){
        URI absoluteUri = getAbsoluteUri(uri);
        if (absoluteUri == null) {
          final MapModel map = Controller.getCurrentController().getMap();
          if (map.getURL() == null)
            UITools.errorMessage(TextUtils.getText("map_not_saved"));
          else
            UITools.errorMessage(TextUtils.format("link_not_found", String.valueOf(uri)));
          return;
        }
        uri = absoluteUri;
      }
      if(! asList(FILE_SCHEME, SMB_SCHEME, FREEPLANE_SCHEME).contains(uri.getScheme())) {
}
}
//25
public class func{
	public void canonicalize(String uriString){
        if ((uriString == null) || (uriString.compareTo("localhost") == 0)) {
            uriString = "//localhost";
            return new URI(uriString);
        }
        URI u = new URI(uriString);
        if (u.isAbsolute()) {
            if (u.isOpaque()) {
                /*
                 * this code is here to deal with a special case. For ease of
                 * use, we'd like to be able to handle the case where the user
                 * specifies hostname:port, not requiring the scheme part.
                 * This introduces some subtleties.
                 *     hostname:port - scheme = hostname
                 *                   - schemespecificpart = port
                 *                   - hostname = null
                 *                   - userinfo=null
                 * however, someone could also enter scheme:hostname:port and
                 * get into this code. the strategy is to consider this
                 * syntax illegal and provide some code to defend against it.
                 * Basically, we test that the string contains only one ":"
                 * and that the ssp is numeric. If we get two colons, we will
                 * attempt to insert the "//" after the first colon and then
                 * try to create a URI from the resulting string.
                 */
                String scheme = u.getScheme();
                String ssp = u.getSchemeSpecificPart();
                String frag = u.getFragment();
                URI u2 = null;

                int c1index = uriString.indexOf(":");
                int c2index = uriString.lastIndexOf(":");
                if (c2index != c1index) {
                    /*
                     * this is the scheme:hostname:port case. Attempt to
                     * transform this to scheme://hostname:port. If a path
                     * part is part of the original strings, it will be
                     * included in the SchemeSpecificPart. however, the
                     * fragment part must be handled separately.
                     */
                    if (frag == null) {
                        u2 = new URI(scheme + "://" + ssp);
                    } else {
                        u2 = new URI(scheme + "://" + ssp + "#" + frag);
                    }
                    return u2;
                }
                /*
                 * here we have the <string>:<string> case, possibly with
                 * optional path and fragment components. we assume that
                 * the part following the colon is a number. we don't check
                 * this condition here as it will get detected later anyway.
                 */
                u2 = new URI("//" + uriString);
                return u2;
            } else {
                return u;
            }
        } else {
            /*
             * This is the case where we were given a hostname followed
             * by a path part, fragment part, or both a path and fragment
             * part. The key here is that no scheme part was specified.
             * For this case, if the scheme specific part does not begin
             * with "//", then we prefix the "//" to the given string and
             * attempt to create a URI from the resulting string.
             */
            String ssp = u.getSchemeSpecificPart();
            if (ssp.startsWith("//")) {
                return u;
            } else {
                return new URI("//" + uriString);
            }
        }
}
}
//26
public class func{
	public void canonicalize(String uriString){
        if (uriString == null) {
            uriString = "local://0@localhost";
            return new URI(uriString);
        }
        URI u = new URI(uriString);
        if (u.isAbsolute()) {
            if (u.isOpaque()) {
                /*
                 * rmi:1234@hostname/path#fragment converted to
                 * rmi://1234@hostname/path#fragment
                 */
                u = new URI(u.getScheme(), "//" + u.getSchemeSpecificPart(),
                            u.getFragment());
            }
        } else {
            /*
             * make the uri absolute, if possible. A relative URI doesn't
             * specify the scheme part, so it's safe to prepend a "//" and
             * try again.
             */
            if (!uriString.startsWith("//")) {
                if (u.getFragment() == null) {
                    u = new URI("//" + u.getSchemeSpecificPart());
                } else {
                    u = new URI("//" + u.getSchemeSpecificPart() + "#"
                                + u.getFragment());
                }
            }
        }
}
}
//27
public class func{
	public void getElement(URI path,boolean loadIfAbsent){
            URI xmlBase = new URI(path.getScheme(), path.getSchemeSpecificPart(), null);
            SVGDiagram dia = (SVGDiagram) loadedDocs.get(xmlBase);
            if (dia == null && loadIfAbsent)
            {
//System.err.println("SVGUnivserse: " + xmlBase.toString());
//javax.swing.JOptionPane.showMessageDialog(null, xmlBase.toString());
                URL url = xmlBase.toURL();

                loadSVG(url, false);
                dia = (SVGDiagram) loadedDocs.get(xmlBase);
                if (dia == null)
                {
                    return null;
                }
            }
            String fragment = path.getFragment();
            return fragment == null ? dia.getRoot() : dia.getElement(fragment);
}
}
//28
public class func{
	public void getFile(URI absoluteURI){
    if(absoluteURI != null) {
      if(!"file".equals(absoluteURI.getScheme()) || absoluteURI.getFragment() != null) {
        return null;
      }
      try {
        if(absoluteURI.getRawPath().startsWith("//")) {
          return new File("\\\\"+absoluteURI.normalize().getPath());
        }
        else {
          return new File(absoluteURI.normalize());
        }
      }
      catch (Exception e) {
        LogUtils.info("Exception in "+ URIUtils.class+".getFile(URI): "+ e.getMessage());
      }
    }
}
}
//29
public class func{
	public void getIFile(URL url,boolean bCreateIfNotExists){
    if (url.getProtocol().equals("file")) {
      try {
        URI uri = url.toURI();
        if (uri.getFragment() != null) {
          uri = new URI(uri.getScheme(), uri.getSchemeSpecificPart(), null);
        }
        return getIFile(new File(uri));
      }
      catch (URISyntaxException ex) {
        throw new RuntimeException(ex);
      }
      catch (IllegalArgumentException ex) {
        // debug getting IAE only in TH - unable to parse URL with fragment identifier
        throw new IllegalArgumentException("Unable to parse URL " + url.toExternalForm(), ex);
      }
    } else if (url.getProtocol().equals("jar")) {
      String path = url.getPath();
      int idx = path.lastIndexOf('!');
      String filePath = path.substring(idx + 1);
      String jarPath = path.substring(0, idx);
      File jarFile;
      try {
        jarFile = getIFile(new URL(jarPath)).toJavaFile();
      }
      catch (MalformedURLException e) {
        throw new RuntimeException(e);
      }
      JarFileDirectoryImpl jarFileDirectory = new JarFileDirectoryImpl(jarFile);

      if( bCreateIfNotExists ) {
        return jarFileDirectory.getOrCreateFile( filePath );
      }
      return jarFileDirectory.file( filePath );
    } else {
      throw new RuntimeException("Unrecognized protocol: " + url.getProtocol());
    }
}
}
//30
public class func{
	public void setTargetUriOptions(URI targetUri){
            throw new IllegalArgumentException(String.format(URI_SCHEME, targetUri.toString()));
        if(targetUri.getFragment() != null)
            throw new IllegalArgumentException(String.format(URI_FRAGMENT, targetUri.toString()));
        if(!(OptionValue.isDefaultValue(OptionValue.Name.URI_HOST, targetUri.getHost().getBytes(CoapMessage.CHARSET))))
            addUriHostOption(targetUri.getHost());
        if(targetUri.getPort() != -1 && targetUri.getPort() != OptionValue.URI_PORT_DEFAULT)
            addUriPortOption(targetUri.getPort());
        addUriPathOptions(targetUri.getPath());
        addUriQueryOptions(targetUri.getQuery());
}
}
//31
public class func{
	public void getRelatedPart(PackageRelationship rel){
       if(! isRelationshipExists(rel)) {
          throw new IllegalArgumentException("Relationship " + rel + " doesn't start with this part " + _partName);
       }
       URI target = rel.getTargetURI();
       if(target.getFragment() != null) {
          String t = target.toString();
          try {
             target = new URI( t.substring(0, t.indexOf('#')) );
          } catch(URISyntaxException e) {
             throw new InvalidFormatException("Invalid target URI: " + target);
          }
       }
       PackagePartName relName = PackagingURIHelper.createPartName(target);
       PackagePart part = _container.getPart(relName);
       if (part == null) {
           throw new IllegalArgumentException("No part found for relationship " + rel);
       }
}
}
//32
public class func{
	public void expand(List<URI> inputs){
    for (URI input : inputs) {
      if (isFileOrDir(input)) {
        Path inputPath = Paths.get(input);
        if (Files.isDirectory(inputPath)) {
          try (DirectoryStream<Path> childPaths = Files.newDirectoryStream(inputPath)) {
            for (Path childPath : childPaths) {
              expanded.add(childPath.toUri());
            }
          }
        } else {
          expanded.add(input);
        }
      } else {
        expanded.add(input);
      }
    }
    for (int i = 0; i < expanded.size(); i++) {
      URI input = expanded.get(i);
      if (input.getScheme() == null) {
        expanded.set(i, new URI("file", input.getSchemeSpecificPart(), input.getFragment()));
      }
    }
}
}
//33
public class func{
	public void getPath(URI uri){
        FileSystem fs = getFileSystem(uri);
        String path = uri.getFragment();
        if (path == null) {
            String uristr = uri.toString();
            int off = uristr.indexOf("!/");
            if (off != -1)
                path = uristr.substring(off + 2);
        }
        if (path != null)
            return fs.getPath(path);
        throw new IllegalArgumentException("URI: "
            + uri
            + " does not contain path fragment ex. jar:///c:/foo.zip!/BAR");
}
}
//34
public class func{
	public void fromUri(URI uri,String username,String password){
        if (uri.getScheme() == null) {
            try {
                return new DiskReader(new URI("file", uri.getSchemeSpecificPart(), uri.getFragment()).toURL());
            } catch (URISyntaxException e) {
                throw new IllegalStateException(
                    "URI syntax exception while adding the 'file' scheme to a path. This should not have happened.", e);
            }
        } else if (uri.getScheme().equals("file")) {
            return new DiskReader(uri.toURL());
        } else if (uri.getScheme().startsWith("http")) {
            return new HttpReader(uri.toURL(), username, password);
        } else {
            return new UrlReader(uri.toURL());
        }
}
}
//35
public class func{
	public void getPublishableConnectURI(TransportConnector connector){
        URI connectorURI = connector.getConnectUri();
        if (connectorURI == null) {
            return null;
        }
        String scheme = connectorURI.getScheme();
        if ("vm".equals(scheme)) {
            return connectorURI;
        }
        String userInfo = getPublishedUserInfoValue(connectorURI.getUserInfo());
        String host = getPublishedHostValue(connectorURI.getHost());
        int port = connectorURI.getPort();
        if (portMapping.containsKey(port)) {
            port = portMapping.get(port);
        }
        String path = getPublishedPathValue(connectorURI.getPath());
        String fragment = getPublishedFragmentValue(connectorURI.getFragment());
        URI publishedURI = new URI(scheme, userInfo, host, port, path, getClusterClientUriQuery(), fragment);
}
}
//36
public class func{
	public void HttpURI(URI uri){
        _scheme=uri.getScheme();
        _host=uri.getHost();
        if (_host==null && uri.getRawSchemeSpecificPart().startsWith("//"))
            _host="";
        _port=uri.getPort();
        _user = uri.getUserInfo();
        _path=uri.getRawPath();
        _decodedPath = uri.getPath();
        if (_decodedPath != null)
        {
            int p = _decodedPath.lastIndexOf(';');
            if (p >= 0)
                _param = _decodedPath.substring(p + 1);
        }
        _query=uri.getRawQuery();
        _fragment=uri.getFragment();
}
}
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
//38
public class func{
	public void openDocument(final URI location){
      final String scheme = location.getScheme();
      final String host = location.getHost();
      final String path = location.isOpaque() ? location.getSchemeSpecificPart() : location.getPath();
      final int port = location.getPort();
      final String query = location.getQuery();
      final String fragment = location.getFragment();
      final StringBuilder file = new StringBuilder(path);
      if(query != null){
        file.append('?');
        file.append(query);
      }
      if(fragment != null){
        file.append('#');
        file.append(fragment);
      }
      final URL url = new URL(scheme, host, port, file.toString());
      openDocument(url);
}
}
//39
public class func{
	public void addSchemeHostPort(URI uri){
    String scheme = uri.getScheme();
    String host = uri.getHost();
    int port = uri.getPort();
    if (scheme == null) {
      scheme = "http";
    }
    if (host == null) {
      host = "localhost";
    }
    if (port == -1) {
      port = 8080;
    }
      return new URI(scheme, uri.getUserInfo(), host, port, uri.getPath(), uri.getQuery(), uri.getFragment());
      throw new RuntimeException(e);
}
}
//40
public class func{
	public void UriSelector(URI uri){
    if(authority.contains("*:")) {
      int i = authority.lastIndexOf(":") + 1;
      if(i > 1) {
        port = Integer.parseInt(authority.substring(i));
      } else {
        port = -1;
      }
    } else {
      port = uri.getPort();
    }
    path = (null != uri.getPath() ? uri.getPath() : "/*");
    fragment = uri.getFragment();
}
}
//41
public class func{
	public void loadFromClasspath(final URI uri){
                final String fragment = uri.getFragment();
                if (fragment != null && !"".equals(fragment)) {
                    String[] nodes = fragment.split("/");
                    JsonObject subjson = json;

                    for (int i = "".equals(nodes[0]) ? 1 : 0 ; i < nodes.length; i++) {
                        if (subjson.containsField(nodes[i])) {
                            subjson = subjson.getObject(nodes[i]);
                        } else {
                            throw new RuntimeException("Fragment Node #" + nodes[i] + " not found!");
                        }
                    }

                    return subjson;
                }
            throw new RuntimeException(ioe);
}
}
//42
public class func{
	public void unnestUri(URI nestedUri){
      result.append(parts[1]);
    result.append(nestedUri.getPath());
    if (nestedUri.getQuery() != null) {
      result.append("?");
      result.append(nestedUri.getQuery());
    }
    if (nestedUri.getFragment() != null) {
      result.append("#");
      result.append(nestedUri.getFragment());
    }
}
}
//43
public class func{
	public void normalizeSyntax(final URI uri){
            final StringBuilder normalized = new StringBuilder(
                    ref.toASCIIString());
            if (uri.getQuery() != null) {
                // query string passed through unchanged
                normalized.append('?').append(uri.getRawQuery());
            }
            if (uri.getFragment() != null) {
                // fragment passed through unchanged
                normalized.append('#').append(uri.getRawFragment());
            }
}
}
//44
public class func{
	public void rewriteURI(final URI uri){
        if (uri == null) {
            throw new IllegalArgumentException("URI may not be null");
        }
        if (uri.getFragment() != null || uri.getUserInfo() != null) {
            return new URIBuilder(uri).setFragment(null).setUserInfo(null).build();
        } else {
            return uri;
        }
}
}
//45
public class func{
	public void getSegment(final URI uri,final int index){
        final Iterable<String> parts = Splitter.on('/').omitEmptyStrings().trimResults().split(path);
        final int size = Iterables.size(parts);
        if (actualIndex < 0 || actualIndex > size - 1) {
            return Optional.absent();
        }
        return Optional.of(Iterables.get(parts, actualIndex) + (uri.getFragment() == null ? "" : "#" + uri.getRawFragment()));
}
}
//46
public class func{
	public void service(ServletRequest request,ServletResponse response){
        if (!sslEndPoint.contains("/")) {
            path = "/";
        } else {
            path = sslEndPoint.substring(sslEndPoint.indexOf("/"), sslEndPoint.length());
        }
        if (uri != null) {
            try {
                postMethod.setURI(URIUtils.createURI(uri.getScheme(), uri.getHost(), uri.getPort(), path, uri.getQuery(),
                        uri.getFragment()));
            } catch (URISyntaxException e) {
                SoapUI.logError(e);
            }
        }
}
}
//47
public class func{
	public void select(SSPHandler sspHandler){
        Iterator<Element> iter = getElements().get().iterator();
        while (iter.hasNext()){
            el = iter.next();
            try {
                URI uri = new URI(el.absUrl(HREF_ATTR));
                if (isLinkWithProperExtension(uri)) {
                    if (StringUtils.isNotBlank(uri.getFragment())) {
                        iter.remove();
                    } else {
                        linkWithSimpleExtension.add(el);
                    }
                }
            } catch (Exception ex){}
        }
}
}
//48
public class func{
	public void parseFeedUri(String catalogTableUri){
        if (table == null || table.length() == 0) {
            throw new URISyntaxException(tableUri.toString(), "Table name is missing");
        }
        String partRaw = tableUri.getFragment();
        if (partRaw == null || partRaw.length() == 0) {
            throw new URISyntaxException(tableUri.toString(), "Partition details are missing");
        }
        final String rawPartition = partRaw.replaceAll(DOLLAR_EXPR_START_NORMALIZED, DOLLAR_EXPR_START_REGEX)
                                           .replaceAll(EXPR_CLOSE_NORMALIZED, EXPR_CLOSE_REGEX);
}
}
//49
public class func{
	public void getRelativeBaseURI(){
                final String literalAuthority = uri.getAuthority();
                if (!isEqual(baseAuthority, literalAuthority)) {
                    return uri.getSchemeSpecificPart();
                }
                final String literalPath = uri.getPath();
                final String literalQuery = uri.getQueryString();
                final String literalFragment = uri.getFragment();
                if (literalQuery != null || literalFragment != null) {
                    StringBuffer buffer = new StringBuffer();
                    if (literalPath != null) {
                        buffer.append(literalPath);
                    }
                    if (literalQuery != null) {
                        buffer.append('?');
                        buffer.append(literalQuery);
                    }
                    if (literalFragment != null) {
                        buffer.append('#');
                        buffer.append(literalFragment);
                    }
                    return buffer.toString();
                }
}
}
//50
public class func{
	public void safeRelativize(URI baseUri,URI uriToRelativize){
    if (!isNullOrEmpty(uriToRelativize.getQuery())) {
      stringbuilder.append("?");
      stringbuilder.append(uriToRelativize.getQuery());
    }
    if (!isNullOrEmpty(uriToRelativize.getFragment())) {
      stringbuilder.append("#");
      stringbuilder.append(uriToRelativize.getRawFragment());
    }
}
}
//51
public class func{
	public void rewriteUrl(String urlString){
      if (uri.getPath() != null)
        newUri.append(uri.getPath());
      newUri.append(query);
      if (uri.getFragment() != null) {
        newUri.append("#");
        newUri.append(uri.getFragment());
      }
}
}
//52
public class func{
	public void getResourceElement(Application app,Element resElement,GrammarInfo gInfo,Set<String> typeClassNames,String type,File srcDir){
                String wadlRefPath = app.getWadlPath() != null 
                    ? getBaseWadlPath(app.getWadlPath()) + wadlRef.getPath() : wadlRef.getPath();
                Application refApp = new Application(readIncludedDocument(wadlRefPath),
                                                     wadlRefPath);
                GrammarInfo gInfoBase = generateSchemaCodeAndInfo(refApp, typeClassNames, srcDir);
                if (gInfoBase != null) {
                    gInfo.getElementTypeMap().putAll(gInfoBase.getElementTypeMap());
                    gInfo.getNsMap().putAll(gInfoBase.getNsMap());
                }
                return getResourceElement(refApp, resElement, gInfo, typeClassNames, 
                                          "#" + wadlRef.getFragment(), srcDir);
}
}
//53
public class func{
	public void getProxyUri(URI originalUri,URI proxyUri,ApplicationId id){
          originalUri == null ? null : originalUri.getQuery(),
          originalUri == null ? null : originalUri.getFragment());
      throw new RuntimeException("Could not proxify "+originalUri,e);
}
}
//54
public class func{
	public void addParams(final URI uri,final Multimap<String,String> params,final Set<String> overrideParams){
        for (Map.Entry<String, Collection<String>> param : params.asMap().entrySet()) {
            final String key = param.getKey();
            Collection<String> origList = origParams.remove(key);
            if (origList != null && (overrideParams == null || !overrideParams.contains(key))) {
                first = addParams(result, first, key, origList);
            }
            Collection<String> list = param.getValue();
            first = addParams(result, first, key, list);
        }
        for (Map.Entry<String, Collection<String>> param : origParams.entrySet()) {
            final String key = param.getKey();
            Collection<String> list = param.getValue();
            first = addParams(result, first, key, list);
        }
        if (uri.getFragment() != null) {
            result.append('#').append(uri.getRawFragment());
        }
}
}
//55
public class func{
	public void identifyNewCommitResource(HttpServletRequest request,HttpServletResponse response,Repository db,String newCommit){
      for (int i = 0; i < p.segmentCount(); i++) {
        String s = p.segment(i);
        if (i == 2) {
          s += ".." + GitUtils.encode(newCommit); //$NON-NLS-1$
        }
        np = np.append(s);
      }
      if (p.hasTrailingSeparator())
        np = np.addTrailingSeparator();
      URI nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), np.toString(), request.getQueryString(), u.getFragment());
}
}
//56
public class func{
	public void getURIValue(URI base){
            if (base == null) return uriFrag;
            URI relBase = new URI(null, base.getSchemeSpecificPart(), null);
            if (relBase.isOpaque())
            {
                relUri = new URI(null, base.getSchemeSpecificPart(), uriFrag.getFragment());
            }
            else
            {
                relUri = relBase.resolve(uriFrag);
            }
            return new URI(base.getScheme() + ":" + relUri);
}
}
//57
public class func{
	public void extractData(ClientHttpResponse response){
      URI location = response.getHeaders().getLocation();
      if (location == null) {
        return null;
      }
      String fragment = location.getFragment();
      OAuth2AccessToken accessToken = DefaultOAuth2AccessToken.valueOf(OAuth2Utils.extractMap(fragment));
      if (accessToken.getValue() == null) {
        throw new UserRedirectRequiredException(location.toString(), Collections.<String, String> emptyMap());
      }
}
}
//58
public class func{
	public void safeRelativize(final URI baseURI,final URI toUri){
            if (!Utility.isNullOrEmpty(toUri.getQuery())) {
                sb.append("?");
                sb.append(toUri.getQuery());
            }
            if (!Utility.isNullOrEmpty(toUri.getFragment())) {
                sb.append("#");
                sb.append(toUri.getRawFragment());
            }
}
}
//59
public class func{
	public void safeRelativize(final URI baseURI,final URI toUri){
            if (!Utility.isNullOrEmpty(toUri.getQuery())) {
                sb.append("?");
                sb.append(toUri.getQuery());
            }
            if (!Utility.isNullOrEmpty(toUri.getFragment())) {
                sb.append("#");
                sb.append(toUri.getRawFragment());
            }
}
}
//60
public class func{
	public void loadFromURL(final URI uri){
                final String fragment = uri.getFragment();
                if (fragment != null) {
                    if (json.containsField(fragment)) {
                        return json.getObject(fragment);
                    } else {
                        throw new RuntimeException("Fragment #" + fragment + " not found!");
                    }
                }
            throw new RuntimeException(ioe);
}
}
//61
public class func{
	public void loadFromFile(final URI uri){
                final String fragment = uri.getFragment();
                if (fragment != null) {
                    if (json.containsField(fragment)) {
                        return json.getObject(fragment);
                    } else {
                        throw new RuntimeException("Fragment #" + fragment + " not found!");
                    }
                }
            throw new RuntimeException(ioe);
}
}
//62
public class func{
	public void getSuffix(URI uri){
        String fragment = uri.getFragment();
        if (fragment != null) {
            fragment = "#" + fragment;
        } else {
            fragment = "";
        }
        String query = uri.getRawQuery();
        if (query != null) {
            query = "?" + query;
        } else {
            query = "";
        }
        return query.concat(fragment);
}
}
//63
public class func{
	public void nestURIForLocalJavaKeyStoreProvider(final URI localFile){
    if (!("file".equals(localFile.getScheme()))) {
      throw new IllegalArgumentException("passed URI had a scheme other than " +
          "file.");
    }
    if (localFile.getAuthority() != null) {
      throw new IllegalArgumentException("passed URI must not have an " +
          "authority component. For non-local keystores, please use " +
          JavaKeyStoreProvider.class.getName());
    }
    return new URI(LocalJavaKeyStoreProvider.SCHEME_NAME,
        "//file" + localFile.getSchemeSpecificPart(), localFile.getFragment());
}
}
//64
public class func{
	public void removeTrailingPath(URL url,String trailingPath){
    URI uri = url.toURI();
    String specificPart = uri.getSchemeSpecificPart();
    if (specificPart == null) {
      return null;
    }
    int index = specificPart.lastIndexOf(trailingPath);
    if (index < 0) {
      return null;
    }
    String partialPart = specificPart.substring(0, index);
    URI trimmedUri = new URI(uri.getScheme(), partialPart, uri.getFragment());
    return trimmedUri.toURL();
}
}
//65
public class func{
	public void matches(Object key){
    if(null == key) {
      return false;
    }
    URI uri = objectToURI(key);
    if(uri == null){
      return false;
    }
    boolean schemeMatches = "*".equals(scheme) || scheme.equals(uri.getScheme());
    boolean hostMatches = "*".equals(host) || host.equals(uri.getHost());
    boolean portMatches = -1 == port || port == uri.getPort();
    boolean pathMatches = "/*".equals(path) || path.equals(uri.getPath());
    boolean fragmentMatches = null == fragment || fragment.equals(uri.getFragment());
}
}
//66
public class func{
	public void update(TreeItem ti0,String text,URI uri){
    TreeItem ti = createObj(ti0, text, uri == null ? NULL : uri.toString(), uri);
    if (uri == null || !check(ti, uri)) return ti;
    create(ti, "getAuthority()", uri.getAuthority()); //$NON-NLS-1$
    create(ti, "getFragment()", uri.getFragment()); //$NON-NLS-1$
    create(ti, "getHost()", uri.getHost()); //$NON-NLS-1$
    create(ti, "getPath()", uri.getPath()); //$NON-NLS-1$
    create(ti, "getPort()", uri.getPort()); //$NON-NLS-1$
    create(ti, "getQuery()", uri.getQuery()); //$NON-NLS-1$
    create(ti, "isAbsolute()", uri.isAbsolute()); //$NON-NLS-1$
    create(ti, "isOpaque()", uri.isOpaque()); //$NON-NLS-1$
    create(ti, "toASCIIString()", uri.toASCIIString()); //$NON-NLS-1$
}
}
//67
public class func{
	public void annotate(Document document,AnnotationInfo[] annotations){
      URI          context    = new URI(annotations[i].getContext());
      String       expression = URLDecoder.decode(context.getFragment());
      LocationList list       = XPointerAPI.evalFullptr(document, expression);
      int          length     = list.getLength();
      for (int j = 0; j < length; j++) {
        Location location = list.item(j);
        Range    range;

        if (location.getType() == Location.RANGE)
          range = (Range) location.getLocation();
        else {
          range = ((DocumentRange) document).createRange();
          range.selectNode((Node) location.getLocation());
        }

        // Ignore it if this range is collapsed (ie. start == end)
        if (!range.getCollapsed())
          srl.insert(new SelectionRange(range, annotations[i]));
      }
    srl.surroundContents(NS, "aml:annotated", "aml:id", "aml:first");
    Element index = document.createElementNS(NS, "aml:regions");
    document.getDocumentElement().appendChild(index);
}
}
//68
public class func{
	public void create(URI target){
    if(target==null) {
      throw new NullPointerException("URI cannot be null");
    }
    if(target.isOpaque()) {
      throw new IllegalArgumentException("URI must be hierarchical");
    }
    URI targetDir = target.resolve(".");
    String targetFile=target.getPath().substring(targetDir.getPath().length());
    String targetQuery = target.getQuery();
    String targetFragment=target.getFragment();
}
}
//69
public class func{
	public void processFiles(File jobLocDir,@Nullable Object[] files,boolean download,boolean extract,@Nullable Collection<URL> clsPathUrls,@Nullable String rsrcNameProp){
        for (Object pathObj : files) {
            String locName = null;
            Path srcPath;

            if (pathObj instanceof URI) {
                URI uri = (URI)pathObj;

                locName = uri.getFragment();

                srcPath = new Path(uri);
            }
            else
                srcPath = (Path)pathObj;

            if (locName == null)
                locName = srcPath.getName();

            File dstPath = new File(jobLocDir.getAbsolutePath(), locName);

            res.add(locName);

            rsrcSet.add(dstPath);

            if (clsPathUrls != null)
                clsPathUrls.add(dstPath.toURI().toURL());

            if (!download)
                continue;

            JobConf cfg = ctx.getJobConf();

            FileSystem dstFs = FileSystem.getLocal(cfg);

            FileSystem srcFs = srcPath.getFileSystem(cfg);

            if (extract) {
                File archivesPath = new File(jobLocDir.getAbsolutePath(), ".cached-archives");

                if (!archivesPath.exists() && !archivesPath.mkdir())
                    throw new IOException("Failed to create directory " +
                         "[path=" + archivesPath + ", jobId=" + jobId + ']');

                File archiveFile = new File(archivesPath, locName);

                FileUtil.copy(srcFs, srcPath, dstFs, new Path(archiveFile.toString()), false, cfg);

                String archiveNameLC = archiveFile.getName().toLowerCase();

                if (archiveNameLC.endsWith(".jar"))
                    RunJar.unJar(archiveFile, dstPath);
                else if (archiveNameLC.endsWith(".zip"))
                    FileUtil.unZip(archiveFile, dstPath);
                else if (archiveNameLC.endsWith(".tar.gz") ||
                    archiveNameLC.endsWith(".tgz") ||
                    archiveNameLC.endsWith(".tar"))
                    FileUtil.unTar(archiveFile, dstPath);
                else
                    throw new IOException("Cannot unpack archive [path=" + srcPath + ", jobId=" + jobId + ']');
            }
            else
                FileUtil.copy(srcFs, srcPath, dstFs, new Path(dstPath.toString()), false, cfg);
        }
}
}
//70
public class func{
	public void createUri(URI uri,String queryString){
    String fragmentPart = uri.getFragment() == null ? "" : "#" + uri.getRawFragment();//$NON-NLS-1$ //$NON-NLS-2$
    URI pathonly = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), null, null);
}
}
//71
public class func{
	public void resolve(final URI originalURI,final HttpHost target,final List<URI> redirects){
            uribuilder = new URIBuilder(originalURI);
            for (int i = redirects.size() - 1; frag == null && i >= 0; i--) {
                frag = redirects.get(i).getFragment();
            }
            uribuilder.setFragment(frag);
        if (uribuilder.getFragment() == null) {
            uribuilder.setFragment(originalURI.getFragment());
        }
        if (target != null && !uribuilder.isAbsolute()) {
            uribuilder.setScheme(target.getSchemeName());
            uribuilder.setHost(target.getHostName());
            uribuilder.setPort(target.getPort());
        }
        return uribuilder.build();
}
}
//72
public class func{
	public void getVirtualRootURI(URI uri){
    if (!ROOT_STRING.equals(uri.getPath()) || uri.getFragment() != null) {
      try {
        uri = new URI(uri.getScheme(), uri.getAuthority(), ROOT_STRING, null, null);
      } catch (URISyntaxException e) {
      }
    }
}
}
//73
public class func{
	public void append(String base,Map<String,?> query,Map<String,String> keys,boolean fragment){
        if (keys != null && keys.containsKey(key)) {
          name = keys.get(key);
        }
        values.append(name + "={" + key + "}");
      if (values.length() > 0) {
        template.fragment(values.toString());
      }
      UriComponents encoded = template.build().expand(query).encode();
      builder.fragment(encoded.getFragment());
      template.fragment(redirectUri.getFragment());
      UriComponents encoded = template.build().expand(query).encode();
      builder.query(encoded.getQuery());
    return builder.build().toUriString();
}
}
//74
public class func{
	public void uriToStringNoFragment(XFormsContainingDocument containingDocument,URI resolvedURI){
        if (containingDocument.isPortletContainer() && resolvedURI.getFragment() != null) {
            // XForms page was loaded from a portlet and there is a fragment, remove it
            try {
                return new URI(resolvedURI.getScheme(), resolvedURI.getRawAuthority(), resolvedURI.getRawPath(), resolvedURI.getRawQuery(), null).toString();
            } catch (URISyntaxException e) {
                throw new OXFException(e);
            }
        } else {
            return resolvedURI.toString();
        }
}
}
//75
public class func{
	public void getFileFromURL(URL url){
        URI uri = url.toURI();
        if ( uri.getFragment() != null ) {
          uri = new URI( uri.getScheme(), uri.getSchemeSpecificPart(), null );
        }
        return new File( uri );
}
}
//76
public class func{
	public void getFileFromURL(@NotNull URL url){
        URI uri = url.toURI();
        if (uri.getFragment() != null) {
          uri = new URI(uri.getScheme(), uri.getSchemeSpecificPart(), null);
        }
        return new File(uri);
}
}
//77
public class func{
	public void getSymLinkTarget(Path p){
            Path tempPath = new URI(p.toString()).getFragment() == null ? p : new Path(new URI(p.toString()).getPath());
            return fs.getFileLinkStatus(tempPath).getSymlink();
}
}
//78
public class func{
	public void normalizeSyntax(final URI uri){
            final URI ref = new URI(scheme, auth, outputBuffer.toString(),
                    null, null);
            if (uri.getQuery() == null && uri.getFragment() == null) {
                return ref;
            }
}
}
//79
public class func{
	public void getXmldbURI(final URI uri,final boolean mustHaveXMLDB){
        if ((uri.getScheme() != null) || (uri.getFragment() != null) || (uri.getQuery() != null)) {
            return new FullXmldbURI(uri, mustHaveXMLDB);
        }
        return new XmldbURI(uri, mustHaveXMLDB);
}
}
//80
public class func{
	public void getXmldbURI(final URI uri){
        if ((uri.getScheme() != null) || (uri.getFragment() != null) || (uri.getQuery() != null)) {
            return new FullXmldbURI(uri);
        }
        return new XmldbURI(uri);
}
}
//81
public class func{
	public void isFilePartOfConfList(Path path){
        String fragmentName = new URI(path.toString()).getFragment();
        String fileName = fragmentName == null ? path.getName() : fragmentName;
        return actionConfSet.contains(fileName);
}
}
//82
public class func{
	public void run(){
            Socket sock = ss.accept();
            InputStream is = sock.getInputStream();
            OutputStream os = sock.getOutputStream();
            MessageHeader headers =  new MessageHeader (is);
            String requestLine = headers.getValue(0);
            int first  = requestLine.indexOf(' ');
            int second  = requestLine.lastIndexOf(' ');
            String URIString = requestLine.substring(first+1, second);
            URI requestURI = new URI(URIString);
            if (requestURI.getFragment() != null)
                os.write(replyFAILED.getBytes("UTF-8"));
            else
                os.write(replyOK.getBytes("UTF-8"));
}
}
//83
public class func{
	public void pruneFragment(URI uri){
        if (uri.getFragment() != null) {
            int hashIndex = uri.toString().indexOf("#");
            return new URI(uri.toString().substring(0, hashIndex));
        }
}
}
//84
public class func{
	public void updateTextField(){
                URI uri = new URI(textField.getText());
                String fragment = uri.getFragment();
                if (fragment != null) {
                    textField.setText(fragment);
                }
                else {
                    textField.setText(getFragment());
                }
}
}
//85
public class func{
	public void getLocationURI(final HttpResponse response,final HttpContext context){
      if (uri.getFragment() != null) {
        try {
          HttpHost target = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
          redirectURI = URIUtils.rewriteURI(uri, target, true);
        } catch (URISyntaxException ex) {
          throw new ProtocolException(ex.getMessage(), ex);
        }
      } else {
        redirectURI = uri;
      }
}
}
//86
public class func{
	public void getLocationURI(final HttpResponse response,final HttpContext context){
            if (uri.getFragment() != null) {
                try {
                    final HttpHost target = new HttpHost(
                            uri.getHost(),
                            uri.getPort(),
                            uri.getScheme());
                    redirectURI = URIUtils.rewriteURI(uri, target, true);
                } catch (final URISyntaxException ex) {
                    throw new ProtocolException(ex.getMessage(), ex);
                }
            } else {
                redirectURI = uri;
            }
}
}
//87
public class func{
	public void getLocationURI(final HttpResponse response,final HttpContext context){
            if (uri.getFragment() != null) {
                try {
                    HttpHost target = new HttpHost(
                            uri.getHost(),
                            uri.getPort(),
                            uri.getScheme());
                    redirectURI = URIUtils.rewriteURI(uri, target, true);
                } catch (URISyntaxException ex) {
                    throw new ProtocolException(ex.getMessage(), ex);
                }
            } else {
                redirectURI = uri;
            }
}
}
//88
public class func{
	public void parseFromString(String raw,char separator){
        if (!"salt".equals(uri.getScheme()) || uri.getFragment() == null)
        {
          throw new URISyntaxException("not a Salt id", uri.toString());
        }
        log.error("Invalid syntax for ID " + singleMatch, ex);
      match.addSaltId(uri, anno);
}
}
//89
public class func{
	public void addShareLib(Configuration conf,String[] actionShareLibNames){
                                                return (new URI(toString())).getFragment() == null ? new Path(toUri()).getName()
                                                        : (new URI(toString())).getFragment();
}
}
//90
public class func{
	public void getName(){
                                                return (new URI(toString())).getFragment() == null ? new Path(toUri()).getName()
                                                        : (new URI(toString())).getFragment();
}
}
//91
public class func{
	public void parse(final String uriString){
            String path = uri.getPath();
      if (path == null) {
        path = "";
      }
            String fragment = uri.getFragment();
}
}
//92
public class func{
	public void getCURIE(URI uri){
    String s = uri.toString();
    String namespace = s.substring(0, s.indexOf(OntMapper.NUMBER_SIGN));
    if (!namespace.equals(Janus.ontologyURI)) {
      String prefix = PrefixMap.getPrefix(URI.create(namespace));
      
      return prefix + OntMapper.COLON + uri.getFragment();
    }
    return OntMapper.COLON + uri.getFragment();
}
}
//93
public class func{
	public void getClassType(URI classURI){
    if (classURI.toString().equals(OntEntityTypes.OWL_THING_CLASS.pattern()))
      return OntEntityTypes.OWL_THING_CLASS;
    String className = classURI.getFragment();
}
}
//94
public class func{
	public void getMRFrameworkName(Configuration conf){
      frameworkName = uri.getFragment();
      if (frameworkName == null) {
        frameworkName = new Path(uri).getName();
      }
}
}
//95
public class func{
	public void resolveRelativeURI(URI base,String rel){
    if (base.getFragment() != null) {
      return base + rel;
    }
    return base.resolve(rel).toString();
}
}
//96
public class func{
	public void loadURL(URI uri){
          final ModeController modeController = Controller.getCurrentModeController();
          modeController.getMapController().newMap(url);
          final String ref = uri.getFragment();
          if (ref != null) {
            final ModeController newModeController = Controller.getCurrentModeController();
            final MapController newMapController = newModeController.getMapController();
            newMapController.select(newMapController.getNodeFromID(ref));
          }
}
}
//97
public class func{
	public void loadURL(URI uri){
          final ModeController modeController = Controller.getCurrentModeController();
          modeController.getMapController().newMap(url);
          final String ref = uri.getFragment();
          if (ref != null) {
            final ModeController newModeController = Controller.getCurrentModeController();
            final MapController newMapController = newModeController.getMapController();
            newMapController.select(newMapController.getNodeFromID(ref));
          }
}
}
//98
public class func{
	public void getPropertyType(URI propertyURI){
    if (property.equals(OntEntityTypes.OWL_TOP_OBJECT_PROPERTY.pattern()))
      return OntEntityTypes.OWL_TOP_OBJECT_PROPERTY;
    String propertyFragment = propertyURI.getFragment();
}
}
//99
public class func{
	public void getPathURI(Path destPath,String fragment){
    URI pathURI = destPath.toUri();
    if (pathURI.getFragment() == null) {
      if (fragment == null) {
        pathURI = new URI(pathURI.toString() + "#" + destPath.getName());
      } else {
        pathURI = new URI(pathURI.toString() + "#" + fragment);
      }
    }
}
}
//100
public class func{
	public void finishProcess(HTTPRequest req,String overrideType,String path,URI u,boolean noRelative){
      if(u.getFragment() != null) {
        sb.append('#');
        sb.append(u.getRawFragment());
      }
}
}
//101
public class func{
	public void smbUri2unc(final URI uri){
    final String fragment = uri.getFragment();
    if(fragment != null)
      uriString = uriString + '#' + fragment;
}
}
//102
public class func{
	public void appendQueryParameter(URI uri,OAuth2AccessToken accessToken){
      if (uri.getFragment() != null) {
        sb.append("#");
        sb.append(uri.getFragment());
      }
}
}
//103
public class func{
	public void urlExtractFragment(@SqlType(StandardTypes.VARCHAR) Slice url){
        URI uri = parseUrl(url);
        return (uri == null) ? null : slice(uri.getFragment());
}
}
//104
public class func{
	public void addCacheResources(Set<String> fileNames){
        for (String fileName : fileNames) {
            fileName = fileName.trim();
            if (fileName.length() > 0) {
                URI resourceURI = new URI(fileName);
                String fragment = resourceURI.getFragment();

                Path remoteFsPath = new Path(resourceURI.getPath());
                String resourceName = (fragment != null && fragment.length() > 0) ? fragment : remoteFsPath.getName();

                addExtraResource(resourceName, remoteFsPath);
            }
        }
}
}
//105
public class func{
	public void taskFinished(){
              String executable = Submitter.getExecutable(localJobConf);
              if ( executable != null) {
              try {
                program = new URI(executable).getFragment();
              } catch (URISyntaxException ur) {
                LOG.warn("Problem in the URI fragment for pipes executable");
              }
              }
}
}
//106
public class func{
	public void runDebugScript(){
      String executable = Submitter.getExecutable(localJobConf);
      if ( executable != null) {
        try {
          program = new URI(executable).getFragment();
        } catch (URISyntaxException ur) {
          LOG.warn("Problem in the URI fragment for pipes executable");
        }     
      }
}
}
//107
public class func{
	public void fromUri(final URI uri){
                uri.getScheme(), uri.getUserInfo(), uri.getHost(),
                uri.getPort() == -1 ? null : uri.getPort(),
                decoder.decodePath(uri.getRawPath()),
                decoder.parseQueryString(uri.getRawQuery()),
                decoder.decodeFragment(uri.getFragment()));
}
}
//108
public class func{
	public void apply(@Nullable final URI input){
            final URI uri = URI_NORMALIZER.apply(input);
            if (uri == null)
                return null;
                return new URI(uri.getScheme(), uri.getSchemeSpecificPart(),
                    Optional.fromNullable(uri.getFragment()).or(""));
                throw new RuntimeException("How did I get there??", e);
}
}
//109
public class func{
	public void createFromURL(String url){
    res.setScheme(uri.getScheme());
    res.setUserInfo(uri.getUserInfo());
    if (uri.getHost() == null && res.getHasScheme())
    {
      try
      {
        java.net.URL u = new java.net.URL(url);
        res.setHost(u.getHost());
        res.setPort(u.getPort());
      }
      catch (java.net.MalformedURLException e)
      {
        URISyntaxException uex = new URISyntaxException(url, e.getMessage());
        uex.initCause(e); // keep the original exception
        throw uex;
      }
    }
    else
    {
      res.setHost(uri.getHost());
      res.setPort(uri.getPort());
    }
    res.setPath(uri.getRawPath());
    res.setFragment(uri.getFragment());
    res.addQuery(uri);
}
}
//110
public class func{
	public void getPathWithFragment(URI uri){
    String path = uri.getPath();
    String fragment = uri.getFragment();
    if (StringUtils.hasText(fragment)) {
      path = path + "#" + fragment;
    }
}
}
//111
public class func{
	public void checkNoFragment(URI address){
    String fragment = address.getFragment();
    if (fragment != null && fragment.length() > 0) {
      throw new IllegalAddressException(
          address, IllegalAddressException.Reason.FRAGMENT_UNSUPPORTED, null);
    }
}
}
//112
public class func{
	public void getMatch(URI uri){
      addComplexMatch(
          pattern.getSchemeSpecificPart(),
          uri.getSchemeSpecificPart(),
          result);
      for (String patternPart : PATH_SPLITTER.split(pattern.getPath())) {
        if (!addMatch(patternPart, parts, result)) {
          // abort if the pattern doesn't account for an entry
          return null;
        }
      }
      addQuery(uri, result);
    if (!addComplexMatch(pattern.getFragment(), uri.getFragment(), result)) {
}
}
//113
public class func{
	public void extractFragment(URI address){
    String frag = address.getFragment();
    if (frag == null || frag.length() == 0) {
      throw new IllegalAddressException(
          address, IllegalAddressException.Reason.MISSING_FRAGMENT, null);
    }
}
}
//114
public class func{
	public void retrieveAccessTokenFromFragment(String url){
    URI uri = URI.create(url);
    final String fragment = uri.getFragment();
      if (StringUtil.isNotEmpty(fragment)) {
        parameters = new HashMap<String, String>();
        Scanner scanner = new Scanner(fragment);
      scanner.useDelimiter("&");
      while (scanner.hasNext()) {
              final String[] nameValue = scanner.next().split("=");
              if (nameValue.length == 0 || nameValue.length > 2){
                  throw new IllegalArgumentException("Bad parameter");
              }
              final String name = nameValue[0];
              String value = null;
              if (nameValue.length == 2){
                value = nameValue[1];
              }
              parameters.put(name, value);
          }
      }
}
}
//115
public class func{
	public void assertHasFragment(AssertionInfo info,URI actual,String expected){
    assertNotNull(info, actual);
    if (!areEqual(actual.getFragment(), expected)) throw failures.failure(info, shouldHaveFragment(actual, expected));
}
}
//116
public class func{
	public void finishProcess(HTTPRequest req,String overrideType,String path,URI u,boolean noRelative){
      Logger.error(this, "Could not parse own URI: path="+path+", typeOverride="+typeOverride+", frag="+u.getFragment()+" : "+e, e);
      if(typeOverride != null)
        p += "?type="+typeOverride;
}
}
