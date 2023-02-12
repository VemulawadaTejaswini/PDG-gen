public class func{
public void printWallClockTime(){
  Calendar cal = Calendar.getInstance();
  LOG.info(dateFormat.format(cal.getTime()));
}
}
