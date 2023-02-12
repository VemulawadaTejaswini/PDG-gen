public class func{
public void addQueryParameters(Map<String,Object> parameters,URI baseUrl){
      String newQuery = addQueryParameters(baseUrl.getQuery(), parameters);
      return new URI(baseUrl.getScheme(), baseUrl.getUserInfo(), baseUrl.getHost(), baseUrl.getPort(), baseUrl.getPath(), newQuery, baseUrl.getFragment());
      throw new UrlBuilderException(e);
}
}
