public class func{
public void toISO8601UTCTimeFormat(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(date);
}
}
