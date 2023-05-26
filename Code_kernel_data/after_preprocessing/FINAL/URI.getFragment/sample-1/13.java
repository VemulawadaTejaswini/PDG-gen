public class func{
public void parseURL(String uri){
    String sessVars = jdbcURI.getPath();
    if ((sessVars != null) && !sessVars.isEmpty()) {
      String dbName = "";
      sessVars = sessVars.substring(1);
      if (!sessVars.contains(";")) {
        dbName = sessVars;
      } else {
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
      connParams.setHost(jdbcURI.getHost());
      connParams.setPort(jdbcURI.getPort());
    } else {
      String resolvedAuthorityString = resolveAuthority(connParams);
      LOG.info("Resolved authority: " + resolvedAuthorityString);
      uri = uri.replace(dummyAuthorityString, resolvedAuthorityString);
      connParams.setJdbcUriString(uri);
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
