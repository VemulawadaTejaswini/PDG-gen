//1
public class func{
public void create(GelfSenderConfiguration configuration){
        if (hostUri.getFragment() == null || hostUri.getFragment().trim().equals("")) {
            throw new IllegalArgumentException("Redis URI must specify fragment");
        }
        if (hostUri.getHost() == null) {
            throw new IllegalArgumentException("Redis URI must specify host");
        }
        Pool<Jedis> pool = RedisSenderPoolProvider.getJedisPool(hostUri, port);
        return new GelfREDISSender(pool, hostUri.getFragment(), configuration.getErrorReporter());
}
}
