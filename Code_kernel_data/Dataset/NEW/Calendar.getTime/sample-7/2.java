//2
public class func{
public void testToDurationWithDefault(){
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String dur = dataHelper.toDuration(controlDate);
        this.assertEquals("P1970Y1M1DT0H0M0.0S", dur);
}
}
