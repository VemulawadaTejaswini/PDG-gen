public class func{
public void uri(String uriTemplate){
        if (uri.getFragment() != null) {
            this.fragment = uri.getFragment();
        }
        if (uri.isOpaque()) {
            this.ssp = uri.getSchemeSpecificPart();
            this.scheme = uri.getScheme();
            return this;
        }
        if (uri.getScheme() == null && this.ssp != null && uri.getSchemeSpecificPart() != null) {
            this.ssp = uri.getSchemeSpecificPart();
        } else {
            this.scheme = uri.getScheme();
        }
        if (uri.getAuthority() != null) {
            if (uri.getAuthority() == null && uri.getHost() == null && uri.getPort() == -1) {
                this.authority = uri.getAuthority();
                this.userInfo = null;
                this.host = null;
                this.port = null;
            } else {
                this.authority = null;
                if (uri.getUserInfo() != null) {
                    this.userInfo = uri.getUserInfo();
                }
                if (uri.getHost() != null) {
                    this.host = uri.getHost();
                }
                if (uri.getPort() != -1) {
                    this.port = Integer.toString(uri.getPort());
                }
            }

        }
        if (uri.getPath() != null) {
            this.path.setLength(0);
            this.path.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            this.query.setLength(0);
            this.query.append(uri.getQuery());
        }
}
}
