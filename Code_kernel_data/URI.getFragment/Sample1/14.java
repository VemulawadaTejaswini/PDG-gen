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
