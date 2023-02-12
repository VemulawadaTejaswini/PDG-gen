public class func{
public void parseISODateStringsAsICal4jDates(final TimeZone timeZone){
    Assert.assertEquals("2013-03-21 08:47", dfUtc.format(dates.get(0)));
    Assert.assertEquals("2013-03-27 09:00", dfLocal.format(dates.get(1)));
}
}
