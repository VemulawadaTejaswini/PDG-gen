public class func{
public void getBusinessDay(Date date,int n){
        Calendar calendar = now();
        calendar.setTime(date);
        while (isHoliday(calendar) || isWeekend(calendar) || n-- > 0) {
            calendar.add(Calendar.DATE, 1);
        }
        return calendar.getTime();
}
}
