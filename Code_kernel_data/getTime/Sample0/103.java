//102
public class func{
	public void testJavaUtilDate(){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2007, 3, 1, 1, 15);
        Date time = cal.getTime();
        String dateTime = DateUtil.serializeDateTime(time);
        assertEquals("2007-04-01T01:15:00", dateTime);
        String date = DateUtil.serializeDate(time);
        assertEquals("2007-04-01", date);
}
}
