//92
public class func{
	public void testWebapp_2_2(){
        File appDir = new File("test/webapp-2.2");
        JspCServletContext context = new JspCServletContext(
                null, appDir.toURI().toURL(), null, false, false);
        Assert.assertEquals(2, context.getEffectiveMajorVersion());
        Assert.assertEquals(2, context.getEffectiveMinorVersion());
}
}
