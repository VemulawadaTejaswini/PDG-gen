//12
public class func{
public void formatDate(Calendar c){
        return (c != null) ? getISO8601DateFormat(c.getTimeZone(), ACTIVE_MASK).format(c.getTime()) : "NULL";
}
}
