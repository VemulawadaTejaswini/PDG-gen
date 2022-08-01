//39
public class func{
	public void checkPosition(NavigationPosition position,CompactCalendar expectedDate){
        String cal2 = format.format(expectedDate.getTime());
        assertEquals(cal2, cal1);
        assertEquals(expectedDate.getTimeInMillis(), actual.getTimeInMillis());
}
}
