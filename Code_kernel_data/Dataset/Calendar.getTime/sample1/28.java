//27
public class func{
	public void shouldGetTimesheetEntriesInRangeForUser(){
        DateRange dateRange = new DateRange(dateStart.getTime(), dateEnd.getTime());
        List<TimesheetEntry> results = timesheetDAO.getTimesheetEntriesInRange(1, dateRange);
        assertEquals(9, results.size());
}
}
