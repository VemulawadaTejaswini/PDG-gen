//10
public class func{
public void testToMonthWithFullSetting(){
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String tm = dataHelper.toMonth(controlDate);
        this.assertEquals("--11", tm);
}
}
