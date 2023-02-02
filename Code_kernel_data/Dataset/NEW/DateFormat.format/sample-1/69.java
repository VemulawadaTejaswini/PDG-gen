//69
public class func{
public void convert(Calendar obj){
            TimeZone timeZone = UtilDateTime.toTimeZone(obj.getTimeZone().getID());
            DateFormat df = UtilDateTime.toDateTimeFormat(UtilDateTime.DATE_TIME_FORMAT, timeZone, locale);
            return df.format(obj);
}
}
