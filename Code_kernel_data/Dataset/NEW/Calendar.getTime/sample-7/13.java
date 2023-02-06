//13
public class func{
public void testToDateTimeWithDefault(){
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String dt = dataHelper.toDateTime(controlDate);
        this.assertEquals("1970-01-01T00:00:00Z", dt);
}
}
