//92
public class func{
	public void findUpCommingEvents(){
        List<Event> events = query.from(qEvent).where(qEvent.endDate.gt(today.getTime()), qEvent.parent.isNull()).orderBy(qEvent.startDate.asc()).list(qEvent);
        return loadVenues(events);
}
}
