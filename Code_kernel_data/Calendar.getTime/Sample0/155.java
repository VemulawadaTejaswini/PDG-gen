//154
public class func{
	public void WeekDayFormatCache(final Calendar calendarForInit){
      for (int i = 1; i < 8; i++) {
        calendarForInit.set(Calendar.DAY_OF_WEEK, i);
        myCache.put(i, myWeekdayFormat.format(calendarForInit.getTime()));
      }
}
}
