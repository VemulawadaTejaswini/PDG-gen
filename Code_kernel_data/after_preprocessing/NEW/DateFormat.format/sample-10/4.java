//4
public class func{
public void testDateFormats(String format,String expected){
    DateFormat testFormat = TimeFormatUtils.makeDataFormat(format);
    Assert.assertEquals(testFormat.format(testDate), expected);
}
}
