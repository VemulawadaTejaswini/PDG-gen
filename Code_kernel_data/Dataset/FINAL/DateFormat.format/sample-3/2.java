public class func{
public void convertMillisToMDYHMSS(long millis){
    Calendar calendar = Calendar.getInstance();    
      calendar.setTimeInMillis(millis);
      return formatter.format(calendar.getTime());
}
}
