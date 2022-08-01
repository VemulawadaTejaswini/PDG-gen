//93
public class func{
	public void testWebresources(){
        File appDir = new File("test/webresources/dir1");
                new JspCServletContext(null, appDir.toURI().toURL(), null);
        Assert.assertEquals(3, context.getEffectiveMajorVersion());
        Assert.assertEquals(1, context.getEffectiveMinorVersion());
}
}
