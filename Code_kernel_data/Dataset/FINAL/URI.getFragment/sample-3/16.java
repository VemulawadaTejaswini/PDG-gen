public class func{
public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("responseTypesCodeIdTokenStep3a", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "The fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertTrue(params.containsKey(AuthorizeResponseParam.CODE));
                        assertTrue(params.containsKey(AuthorizeResponseParam.SCOPE));
                        assertTrue(params.containsKey(AuthorizeResponseParam.STATE));
                        assertTrue(params.containsKey(AuthorizeResponseParam.ID_TOKEN));
                        assertFalse(params.containsKey(AuthorizeResponseParam.ACCESS_TOKEN));

                        authorizationCode2 = params.get(AuthorizeResponseParam.CODE);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    } catch (Exception e) {
                        e.printStackTrace();
                        fail(e.getMessage());
                    }
                }
}
}
