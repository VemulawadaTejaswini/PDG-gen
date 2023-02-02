//5
public class func{
public void testFormat(){
        final DateFormat dateFormat = new CompositeDateFormat();
        Assert.assertEquals("2013-03-08T02:26:05.234+0000", dateFormat.format(date));
}
}
