public class func{
public void format(Date date){
        iso8601Format.setTimeZone(TimeZone.getTimeZone("GMT"));
        return iso8601Format.format(date);
}
}
