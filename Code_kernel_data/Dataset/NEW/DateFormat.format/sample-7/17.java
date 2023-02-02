//17
public class func{
public void formatShortNameOfDay(final Date date){
    final DateFormat df = new SimpleDateFormat("EE", PFUserContext.getLocale());
    df.setTimeZone(PFUserContext.getTimeZone());
    return df.format(date);
}
}
