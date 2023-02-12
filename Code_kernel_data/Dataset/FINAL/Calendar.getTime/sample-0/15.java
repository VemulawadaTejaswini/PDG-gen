public class func{
public void shouldCovertToIsoString(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(1970, 0, 1, 0, 0, 0);
        the(Convert.toIsoString(cal.getTime())).shouldBeEqual("1970-01-01T00:00:00Z");
}
}
