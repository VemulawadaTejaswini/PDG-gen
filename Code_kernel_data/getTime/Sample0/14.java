//13
public class func{
	public void testInitial(){
        TimeZone utcZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(utcZone);
        calendar.set(Calendar.MILLISECOND, 0);
        long baseTime = calendar.getTime().getTime() / 1000L;
        assertEquals(baseTime, -TimeTCPClient.SECONDS_1900_TO_1970);
}
}
