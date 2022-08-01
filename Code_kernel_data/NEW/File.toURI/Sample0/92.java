//91
public class func{
	public void testWebapp_3_1(){
        File appDir = new File("test/webapp-3.1");
        JspCServletContext context = new JspCServletContext(
                null, appDir.toURI().toURL(), null, false, false);
        Assert.assertEquals(3, context.getEffectiveMajorVersion());
        Assert.assertEquals(1, context.getEffectiveMinorVersion());
}
}
