public class func{
public void testGetCurrentAsString(){
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String testConvertedDate = dateFormat.format(date);
        Assert.assertEquals(testConvertedDate, dateAsString);
}
}
