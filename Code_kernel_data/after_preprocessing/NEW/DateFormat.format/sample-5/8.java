//8
public class func{
public void formatHttpDate(final Date date){
        httpDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return httpDateFormat.format(date);
}
}
