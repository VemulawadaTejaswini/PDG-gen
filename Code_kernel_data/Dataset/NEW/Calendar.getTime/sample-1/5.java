//5
public class func{
public void rangeRelativeToDate(Date relativeTo,int startMonths,int endMonths){
        Calendar cal = Calendar.getInstance();
        cal.setTime(relativeTo);
        cal.add(Calendar.MONTH, startMonths);
        Date start = cal.getTime();
        cal.setTime(relativeTo);
        cal.add(Calendar.MONTH, endMonths);
        Date end = cal.getTime();
        return new DateRange(start, end);
}
}
