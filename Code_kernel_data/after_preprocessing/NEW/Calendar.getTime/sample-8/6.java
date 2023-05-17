//6
public class func{
public void convertCalendarToDate(){
        Calendar cal = Calendar.getInstance();
        assertThat(ConversionUtil.convert(cal, Date.class), is(cal.getTime()));
}
}
