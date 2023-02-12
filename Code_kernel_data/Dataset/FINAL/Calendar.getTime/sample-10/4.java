public class func{
public void getNumberOfDaysBetweenTwoDates(Date date1,Date date2){
        cal2.setTime(getDateWithoutTimeStamp(date2));
        return ((cal1.getTime().getTime() - cal2.getTime().getTime()) / (24 * 60 * 60 * 1000));
}
}
