//187
public class func{
public void shouldAddPluginNamespaceToPassedInElement(){
        registry.xsdFor(PluginTestUtil.bundleCtxWithHeaders(m(PluginNamespace.XSD_NAMESPACE_PREFIX, "something", PluginNamespace.XSD_NAMESPACE_URI, "uri")), new File("file:///tmp/foo").toURI().toURL());
}
}
