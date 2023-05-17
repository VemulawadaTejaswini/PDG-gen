public class func{
public void formatHeaderDate(Date date){
        rfc1123Format.setTimeZone(TimeZone.getTimeZone("GMT"));
        return rfc1123Format.format(date);
}
}
