public class func{
public void revokeToken(String accessToken){
            String urlString = new StringBuilder(FacebookConstants.PROFILE_ENDPOINT_URL).append("/permissions?access_token=")
                    .append(URLEncoder.encode(accessToken, "UTF-8")).append("&method=delete").toString();
            URL revokeUrl = new URL(urlString);
            HttpResponseContext revokeContent = OAuthUtils.readUrlContent(revokeUrl.openConnection());
            if (revokeContent.getResponseCode() != 200) {
                throw new OAuthException(OAuthExceptionCode.TOKEN_REVOCATION_FAILED,
                        "Error when revoking token. Http response code: " + revokeContent.getResponseCode() + ", Error details: " + revokeContent.getResponse());
            }
}
}
