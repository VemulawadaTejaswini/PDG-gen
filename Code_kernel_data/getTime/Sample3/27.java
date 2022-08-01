//26
public class func{
	public void getReadingDateHeader(final int dayNumber){
    Calendar calendar = GregorianCalendar.getInstance();
    calendar.setTimeInMillis(readingPlan.info.startTime);
    calendar.add(Calendar.DATE, dayNumber);
    return getString(R.string.rp_dayHeader, (dayNumber + 1), Sqlitil.toLocaleDateMedium(calendar.getTime()));
}
}
