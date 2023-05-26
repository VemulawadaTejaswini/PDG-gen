//124
public class func{
public void testGetAuthorizationUrl(){
      assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test callback URL."), TestConstants.TEST_CALLBACK_URL);
    String authorizationUrl = service.getAuthorizationUrl(TestConstants.TEST_CALLBACK_URL);
    assertNotNullOrEmpty("Authorization URL should not be null.", authorizationUrl);
            URL               url     = new URL(authorizationUrl);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
      if (request.getResponseCode() != HttpURLConnection.HTTP_OK) {
        fail(convertStreamToString(request.getErrorStream()));
      }
}
}
