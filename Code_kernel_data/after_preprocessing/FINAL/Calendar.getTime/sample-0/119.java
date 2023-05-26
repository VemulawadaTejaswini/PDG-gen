public class func{
public void getInvalidDate(){
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);
        calendar.set(year, month, date);
        return calendar.getTime();
}
}
