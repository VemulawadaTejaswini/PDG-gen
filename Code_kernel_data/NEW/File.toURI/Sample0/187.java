//186
public class func{
	public void shouldAddPluginNamespaceToPassedInElement(){
        registry.xsdFor(PluginTestUtil.bundleCtxWithHeaders(m(PluginNamespace.XSD_NAMESPACE_PREFIX, "second", PluginNamespace.XSD_NAMESPACE_URI, "uri-1")), new File("file:///tmp/foo1").toURI().toURL());
}
}
