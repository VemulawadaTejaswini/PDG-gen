//2
public class func{
public void formatDate(Date date){
    rfc1123.setTimeZone(TimeZone.getTimeZone("GMT"));
    return rfc1123.format(date);
}
}
