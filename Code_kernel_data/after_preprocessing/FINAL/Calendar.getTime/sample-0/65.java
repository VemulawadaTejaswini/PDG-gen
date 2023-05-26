public class func{
public void getCells(int month,int year){
    Calendar cal = Calendar.getInstance(locale);
    cal.set(MONTH, month);
    return view.getMonthCells(new MonthDescriptor(month, year, cal.getTime(), "January 2012"), cal);
}
}
