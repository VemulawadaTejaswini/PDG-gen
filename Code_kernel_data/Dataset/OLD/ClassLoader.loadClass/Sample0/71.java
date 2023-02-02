//70
public class func{
	public void testGetApplicationContextClassloader(){
        CamelContext ctx = getOsgiService(CamelContext.class, "(camel.context.symbolicname=CamelBlueprintTestBundle22)", 10000);
        assertNotNull("The application context classloader should not be null", ctx.getApplicationContextClassLoader());
        ClassLoader cl = ctx.getApplicationContextClassLoader();
        assertNotNull("It should load the TestRouteBuilder class", cl.getResource("OSGI-INF/blueprint/test.xml"));
        assertNotNull("It should load the TestRouteBuilder class", cl.loadClass("org.apache.camel.itest.osgi.blueprint.TestRouteBuilder"));
}
}
