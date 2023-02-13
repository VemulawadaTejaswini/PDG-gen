public class func{
public void assertEqualTimes(){
        Calendar cal = Calendar.getInstance();
        cal.set(2010, Calendar.JANUARY, 1, 12, 0, 0);
        Date actual = new Date(cal.getTime().getTime() + 50);
        DroidFuAssertions.assertTimeEquals(expected, actual);
}
}
