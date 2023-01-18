//112
public class func{
	public void testBasicDateFormat(){
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DateUtils.GMT);
        calendar.set(Calendar.MILLISECOND, 0);
        final Date date = calendar.getTime();
        Assert.assertEquals("Fri, 14 Oct 2005 00:00:00 GMT", DateUtils.formatDate(date));
        Assert.assertEquals("Fri, 14 Oct 2005 00:00:00 GMT", DateUtils.formatDate(date, DateUtils.PATTERN_RFC1123));
}
}
