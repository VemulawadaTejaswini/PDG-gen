//4
public class func{
	public void configureSentinel(URI uri){
        checkArgument(isNotEmpty(uri.getFragment()), "URI Fragment must contain the sentinelMasterId");
        String masterId = uri.getFragment();
        if (isNotEmpty(uri.getHost())) {
            if (uri.getPort() != -1) {
                builder = RedisURI.Builder.sentinel(uri.getHost(), uri.getPort(), masterId);
            } else {
                builder = RedisURI.Builder.sentinel(uri.getHost(), masterId);
            }
        }
        if (builder == null && isNotEmpty(uri.getAuthority())) {
            String authority = uri.getAuthority();
            if (authority.indexOf('@') > -1) {
                authority = authority.substring(authority.indexOf('@') + 1);
            }

            String[] hosts = authority.split("\\,");
            for (String host : hosts) {
                HostAndPort hostAndPort = HostAndPort.fromString(host);
                if (builder == null) {
                    if (hostAndPort.hasPort()) {
                        builder = RedisURI.Builder.sentinel(hostAndPort.getHostText(), hostAndPort.getPort(), masterId);
                    } else {
                        builder = RedisURI.Builder.sentinel(hostAndPort.getHostText(), masterId);
                    }
                } else {
                    if (hostAndPort.hasPort()) {
                        builder.withSentinel(hostAndPort.getHostText(), hostAndPort.getPort());
                    } else {
                        builder.withSentinel(hostAndPort.getHostText());
                    }
                }
            }

        }
        checkArgument(builder != null, "Invalid URI, cannot get host part");
}
}
