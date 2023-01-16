//153
public class func{
	public void MonthsCache(final Calendar calendarForInit){
      for (int i = 0; i < 12; i++) {
        calendarForInit.set(Calendar.MONTH, i);
        myCache.put(i, myMonthFormat.format(calendarForInit.getTime()));
      }
}
}
