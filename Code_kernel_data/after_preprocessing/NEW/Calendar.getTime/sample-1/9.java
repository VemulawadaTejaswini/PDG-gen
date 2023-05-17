//9
public class func{
public void format(int time){
    Calendar calendar = clearTime(new GregorianCalendar());
    calendar.set(HOUR_OF_DAY, time);
    begin = DateFormatUtils.format(calendar.getTime(), TIMEPATTERN);
    calendar.add(HOUR_OF_DAY, 1);
    end = DateFormatUtils.format(calendar.getTime(), TIMEPATTERN);
}
}
