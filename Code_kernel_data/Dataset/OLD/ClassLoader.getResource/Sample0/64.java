//63
public class func{
	public void getPortalCacheConfigurationURL(Configuration configuration,ClassLoader classLoader,String configLocation){
    String cacheConfigurationLocation = configuration.get(configLocation);
    if (Validator.isNull(cacheConfigurationLocation)) {
      return null;
    }
    return classLoader.getResource(cacheConfigurationLocation);
}
}
