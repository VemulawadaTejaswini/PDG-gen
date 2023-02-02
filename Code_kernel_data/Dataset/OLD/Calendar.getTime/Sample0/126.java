//125
public class func{
	public void fetchEventsForAMonthWithoutAnyEvents(){
    month.setTime(dateToUseInTests());
    month.add(Calendar.YEAR, 1);
    month.set(Calendar.MONTH, Calendar.MAY);
    List<EventDetail> events = new ArrayList<EventDetail>(eventDAO
        .findAllEventsInPeriod(Period.from(month.getTime(), PeriodType.month, "en"), almanachIds));
}
}
