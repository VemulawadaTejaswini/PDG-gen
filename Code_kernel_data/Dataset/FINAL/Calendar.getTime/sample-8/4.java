public class func{
public void testDateConversion(){
    Calendar refCal = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
    Date refDate = refCal.getTime();
    TimeStamp ts = new TimeStamp(refDate);
    assertEquals("refDate.getTime()", refDate.getTime(), ts.getTime());
}
}
