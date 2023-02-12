public class func{
public void newDate(int year,int month,int dayOfMonth){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
