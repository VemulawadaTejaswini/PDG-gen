//36
public class func{
	public void shouldDetermineIfWorkingDay(){
        Calendar holiday = toCalendar("01-Nov-2010");
        DateTime holidayAsDateTime = new DateTime(holiday.getTime().getTime());
        String holidayAsString = holidayAsDateTime.toLocalDate().toString();
}
}
