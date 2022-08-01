//13
public class func{
	public void gDateTimeToDate(DateTime dateTime){
      cal.add(Calendar.MILLISECOND,
          -cal.getTimeZone().getOffset(cal.getTimeInMillis()));
    return cal.getTime();
}
}
