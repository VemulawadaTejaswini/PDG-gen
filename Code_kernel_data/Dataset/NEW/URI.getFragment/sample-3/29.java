//29
public class func{
public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("responseTypesTokenIdTokenStep3", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "Fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertNotNull(params.get("access_token"), "The access token is null");
                        assertNotNull(params.get("token_type"), "The token type is null");
                        assertNotNull(params.get("id_token"), "The id token is null");
                        assertNotNull(params.get("state"), "The state is null");
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    }
                }
}
}
