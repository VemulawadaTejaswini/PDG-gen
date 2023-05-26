//8
public class func{
public void testToDateTimeWithFullSetting(){
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String tm = dataHelper.toMonthDay(controlDate);
        this.assertEquals("--12-25", tm);
}
}
