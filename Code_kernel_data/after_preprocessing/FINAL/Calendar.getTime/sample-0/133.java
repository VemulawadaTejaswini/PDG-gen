public class func{
public void getDate(String date,int hr,int min){
        cal.setTime(getDate(date));
        cal.set(Calendar.MINUTE, min);
        return cal.getTime();
}
}
