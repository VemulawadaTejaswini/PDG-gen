public class func{
public void getMonthAndYearString(CalendarDay day){
        sbuf.append(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
        sbuf.append(" ");
        sbuf.append(YEAR_FORMAT.format(cal.getTime()));
        return sbuf.toString();
}
}
