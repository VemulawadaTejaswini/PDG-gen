//67
public class func{
	public void assertPastEvent(final Calendar start,final boolean expectedPast){
        cache.setHidden(start.getTime());
        assertThat(CalendarUtils.isPastEvent(cache)).isEqualTo(expectedPast);
}
}
