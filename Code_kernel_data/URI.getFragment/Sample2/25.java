//24
public class func{
	public void populateFromURI(CamelContext camelContext,EndpointConfiguration config,ParameterSetter setter){
        URI uri = config.getURI();
        setter.set(camelContext, config, EndpointConfiguration.URI_SCHEME, uri.getScheme());
        setter.set(camelContext, config, EndpointConfiguration.URI_SCHEME_SPECIFIC_PART, uri.getSchemeSpecificPart());
        setter.set(camelContext, config, EndpointConfiguration.URI_AUTHORITY, uri.getAuthority());
        setter.set(camelContext, config, EndpointConfiguration.URI_USER_INFO, uri.getUserInfo());
        setter.set(camelContext, config, EndpointConfiguration.URI_HOST, uri.getHost());
        setter.set(camelContext, config, EndpointConfiguration.URI_PORT, Integer.toString(uri.getPort()));
        setter.set(camelContext, config, EndpointConfiguration.URI_PATH, uri.getPath());
        setter.set(camelContext, config, EndpointConfiguration.URI_QUERY, uri.getQuery());
        setter.set(camelContext, config, EndpointConfiguration.URI_FRAGMENT, uri.getFragment());
            parameters = URISupport.parseParameters(uri);
            for (Map.Entry<String, Object> pair : parameters.entrySet()) {
                setter.set(camelContext, config, pair.getKey(), pair.getValue());
            }
}
}
