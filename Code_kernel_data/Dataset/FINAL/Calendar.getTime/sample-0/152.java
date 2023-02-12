public class func{
public void getStart(){
      Calendar cal = this.createCalendar();
      cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
      return DateUtil.startOfDay(cal.getTime());
}
}
