public class func{
public void testCheckDateWithoutTimeZone2(){
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
        final Date date = calendar.getTime();
        final Date checkDateWithTimeZone = exampleSProcServiceDateConversion.checkDateWithTimeZone(date);
        Assert.assertEquals(date, checkDateWithTimeZone);
}
}
