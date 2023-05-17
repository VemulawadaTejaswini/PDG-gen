public class func{
public void getFormattedTime(final Date time,final String pattern){
    final DateFormat format = new SimpleDateFormat(pattern, PFUserContext.getLocale());
    format.setTimeZone(PFUserContext.getTimeZone());
    return format.format(time);
}
}
