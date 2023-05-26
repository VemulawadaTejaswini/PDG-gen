public class func{
public void getISO8601StringForDate(Date date){
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat.format(date);
}
}
