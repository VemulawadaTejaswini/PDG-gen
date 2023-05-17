public class func{
public void testDateFormattingWithFourDigitsInYear(){
        Assert.assertEquals("13/12/2008", dateFormat.format(DateUtils.getDate(2008, Calendar.DECEMBER, 13)));
}
}
