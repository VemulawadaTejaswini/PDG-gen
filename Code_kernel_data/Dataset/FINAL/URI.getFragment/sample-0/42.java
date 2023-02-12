public class func{
public void updatePortAndSchemeInAuthority(final URI uri){
        Matcher matcher = HTTP_AUTHORITY_PORT_EXTRACTOR.matcher(uri.getAuthority());
        if (matcher.matches()) {
            int port = Integer.parseInt(matcher.group(2));
            authority = authority.substring(0, matcher.start(2));

            if (UseHttpForHttpsProcessor.this.portMapping.containsKey(port)) {
                port = UseHttpForHttpsProcessor.this.portMapping.get(port);
            }

            authority = authority + port;
        }
        httpUri = new URI("http", authority, uri.getPath(), uri.getQuery(),
                uri.getFragment());
}
}
