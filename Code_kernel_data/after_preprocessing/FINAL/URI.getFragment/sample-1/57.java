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
