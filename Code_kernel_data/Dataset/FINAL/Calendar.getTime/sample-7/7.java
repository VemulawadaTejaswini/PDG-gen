public class func{
public void testToYearWithFullSetting(){
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String tm = dataHelper.toYear(controlDate);
        this.assertEquals("2000", tm);
}
}
