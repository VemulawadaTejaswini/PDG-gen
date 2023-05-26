public class func{
public void main(String args[]){
            boolean schemeCheck = scheme == null? url.getProtocol() == null :
                scheme.equals(url.getProtocol());
            if (!schemeCheck)
                throw new RuntimeException("uri.scheme is " + scheme +
                                           " url.protocol is " +
                                           url.getProtocol());
            if (uri.isOpaque()) {
                String ssp = uri.getSchemeSpecificPart();
                boolean sspCheck = ssp == null? uri.getPath() == null :
                    ssp.equals(url.getPath());
                if (!sspCheck) {
                    throw new RuntimeException("uri.ssp is " + ssp +
                                           " url.path is " + url.getPath());
                }
            } else {
                String authority = uri.getAuthority();
                boolean authorityCheck = authority == null?
                    url.getAuthority() == null :
                    authority.equals(url.getAuthority());
                if (!authorityCheck) {
                    throw new RuntimeException("uri.authority is " +
                                               authority + " url's is " +
                                               url.getAuthority());
                }
                String host = uri.getHost();
                boolean hostCheck = host == null ? url.getHost() == null :
                    host.equals(url.getHost());
                if (!hostCheck)
                    throw new RuntimeException("uri.host is " +
                                               host + " url's is " +
                                               url.getHost());
                if (host != null) {
                    String userInfo = uri.getUserInfo();
                    boolean userInfoCheck = userInfo == null?
                        url.getUserInfo() == null :
                        userInfo.equals(url.getUserInfo());
                    if (uri.getPort() != url.getPort())
                        throw new RuntimeException("uri.port is " +
                                               uri.getPort() + " url's is " +
                                               url.getPort());
                }
                String path = uri.getPath();
                boolean pathCheck = path == null? url.getPath() == null :
                    path.equals(url.getPath());
                if (!pathCheck)
                    throw new RuntimeException("uri.path is " + path +
                                               " url.path is " +
                                               url.getPath());
                String query = uri.getQuery();
                boolean queryCheck = query == null? url.getQuery() == null :
                    query.equals(url.getQuery());
                if (!queryCheck)
                    throw new RuntimeException("uri.query is " + query +
                                               " url.query is " +
                                               url.getQuery());
            }
            String frag = uri.getFragment();
            boolean fragCheck = frag == null? url.getRef() == null :
            frag.equals(url.getRef());
}
}
