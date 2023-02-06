//106
public class func{
public void dateSerial(int year,int month,int day){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
}
}
