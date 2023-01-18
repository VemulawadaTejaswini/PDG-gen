//22
public class func{
	public void assertEqualDates(){
        Calendar cal = Calendar.getInstance();
        cal.set(2010, Calendar.JANUARY, 1, 12, 0, 0);
        Date expected = cal.getTime();
        cal.set(2010, Calendar.JANUARY, 1, 13, 1, 1);
        Date actual = cal.getTime();
        DroidFuAssertions.assertDateEquals(expected, actual);
}
}
