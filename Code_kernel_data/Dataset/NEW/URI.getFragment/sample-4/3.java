//3
public class func{
public void appendAccessTokenToQuery(HttpRequestBase request,OAuthBearerClientRequest oAuthClientRequest){
        URI oldUri = request.getURI();
        String requestQueryString = oldUri.getQuery() != null ? oldUri.getQuery() + "&" + queryString : queryString;
            request.setURI(URIUtils.createURI(oldUri.getScheme(), oldUri.getHost(), oldUri.getPort(),
                    oldUri.getRawPath(), requestQueryString, oldUri.getFragment()));
}
}
