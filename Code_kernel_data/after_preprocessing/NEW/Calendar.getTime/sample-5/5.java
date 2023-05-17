//5
public class func{
public void convertToGMTString(java.util.Calendar cal){
           fmt.setTimeZone( TimeZone.getTimeZone("GMT"));
           fmt.setCalendar(cal);
           java.util.Date date = cal.getTime();
           String timeStr = fmt.format(date);
}
}
