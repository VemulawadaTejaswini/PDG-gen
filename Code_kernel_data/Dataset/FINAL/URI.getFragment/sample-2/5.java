public class func{
public void normalizeUriPath(URI uri){
        if (isNullOrEmpty(uri.getPath())) {
            return uri;
        }
        if ("/".equals(uri.getPath())) {
            try {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), "", uri.getQuery(), uri.getFragment());
            } catch (URISyntaxException e) { // sigh exception.
                LOG.warn("Could not process transportAddress {}, invalid URI syntax", uri);
                return uri;
            }
        }
        LOG.warn("Could not normalize path on node transport address, it contained some unrecognized path: {}", uri);
}
}
