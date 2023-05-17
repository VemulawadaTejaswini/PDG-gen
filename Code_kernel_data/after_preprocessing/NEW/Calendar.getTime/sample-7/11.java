//11
public class func{
public void testToDateTimeWithFullSetting(){
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String tm = dataHelper.toDay(controlDate);
        this.assertEquals("---15", tm);
}
}
