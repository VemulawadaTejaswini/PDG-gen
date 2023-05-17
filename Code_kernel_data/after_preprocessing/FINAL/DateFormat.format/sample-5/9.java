public class func{
public void testConverFromObject_Date_GMTDefault(){
        f.setTimeZone(TimeZone.getTimeZone("GMT"));
        String dateString = f.format(aDate);
        this.assertEquals(origDateString, dateString);
}
}
