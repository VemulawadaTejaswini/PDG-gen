public class func{
public void testToYearMonthWithFullSetting(){
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String tm = dataHelper.toYearMonth(controlDate);
        this.assertEquals("2001-05", tm);
}
}
