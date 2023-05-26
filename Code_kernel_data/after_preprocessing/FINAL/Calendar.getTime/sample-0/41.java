public class func{
public void setDateTime(int year,int month,int day,int hour,int min,int sec){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 0);
        req.setDateTime(cal.getTime());
}
}
