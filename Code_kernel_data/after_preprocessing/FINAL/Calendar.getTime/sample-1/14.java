public class func{
public void getBeginDate(Calendar calendar,Date endDate,List<Date> holidays){
    calendar.setTime(endDate);
    calendar.add(Calendar.DATE, 1);
    while (holidays.contains(calendar.getTime())) {
      calendar.add(Calendar.DATE, 1);
    }
    return calendar.getTime();
}
}
