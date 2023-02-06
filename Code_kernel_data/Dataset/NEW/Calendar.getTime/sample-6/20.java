//20
public class func{
public void fetchEventsForAYearWithoutAnyEvents(){
    Calendar year = Calendar.getInstance();
    year.add(Calendar.YEAR, 10);
    List<EventDetail> events = new ArrayList<EventDetail>(eventDAO
        .findAllEventsInPeriod(Period.from(year.getTime(), PeriodType.year, "en"), almanachIds));
}
}
