//116
public class func{
	public void testEmptyZeroSizeBeansXml(){
        BeanArchiveInformation beanArchiveInformation = bas.getBeanArchiveInformation(emptyBeansXml.toURI().toURL());
        Assert.assertNotNull(beanArchiveInformation);
        Assert.assertEquals(BeanDiscoveryMode.ALL, beanArchiveInformation.getBeanDiscoveryMode());
}
}
