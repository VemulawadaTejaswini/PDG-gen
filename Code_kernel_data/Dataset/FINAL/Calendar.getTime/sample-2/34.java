public class func{
public void getStart(){
      cal.setTime(new ThisWeek().getStart());
      cal.add(Calendar.WEEK_OF_YEAR,-1);
      return DateUtil.startOfDay(cal.getTime());
}
}
