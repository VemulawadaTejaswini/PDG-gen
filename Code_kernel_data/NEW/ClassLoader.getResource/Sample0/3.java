//2
public class func{
	public void find(String resource,ClassLoader... loaders){
        for (ClassLoader loader: loaders) {
            if (loader != null) {
                URL url = loader.getResource(resource);
                if (url != null) {
                    return url;
                }
            }
        }
        throw new IllegalArgumentException(JGroupsLogger.ROOT_LOGGER.notFound(resource));
}
}
