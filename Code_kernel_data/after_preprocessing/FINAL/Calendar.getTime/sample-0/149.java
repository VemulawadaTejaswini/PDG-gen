public class func{
public void getEnd(){
      Calendar cal = this.createCalendar();
      cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
      return DateUtil.endOfDay(cal.getTime());
}
}
