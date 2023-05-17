//17
public class func{
public void makeDate(int year,int month,int date,int hour,int minute,int second,String timeZoneName){
      Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZoneName));
      cal.set(Calendar.MILLISECOND, 0);
      return cal.getTime();
}
}
