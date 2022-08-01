//51
public class func{
	public void runTestCache(int port){
        URI uri2 = new URI(uri.getScheme(), uri.getUserInfo(),
            uri.getHost(), NameNode.DEFAULT_PORT, uri.getPath(),
            uri.getQuery(), uri.getFragment());  
        LOG.info("uri2=" + uri2);
        FileSystem fs = FileSystem.get(uri2, conf);
        checkPath(cluster, fs);
}
}
