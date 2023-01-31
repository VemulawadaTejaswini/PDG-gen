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
