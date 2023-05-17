public class func{
public void getStartOfToday(){
  Calendar today = new GregorianCalendar();
  today.set(Calendar.MILLISECOND, 0);
  return today.getTime();
}
}
