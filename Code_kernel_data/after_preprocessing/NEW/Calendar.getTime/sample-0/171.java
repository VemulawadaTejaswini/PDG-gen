//171
public class func{
public void testHolidays(int month,int dayOfMonth){
        Calendar test = Calendar.getInstance();
        test.set(Calendar.HOUR_OF_DAY, 10);
        setNow(test);
        Assert.assertTrue(isHoliday(test), test.getTime().toString() + " is a holiday?");
}
}
