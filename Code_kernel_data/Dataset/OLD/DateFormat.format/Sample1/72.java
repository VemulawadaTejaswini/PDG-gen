//71
public class func{
	public void timeStampToString(Timestamp stamp,String dateTimeFormat,TimeZone tz,Locale locale){
        DateFormat dateFormat = toDateTimeFormat(dateTimeFormat, tz, locale);
        return dateFormat.format(stamp);
}
}
