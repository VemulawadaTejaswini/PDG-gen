//148
public class func{
	public void testBasicExpiresParse(){
        final Date now = new Date();
        h.parse(cookie, dateformat.format(now));
        Assert.assertNotNull(cookie.getExpiryDate());
}
}
