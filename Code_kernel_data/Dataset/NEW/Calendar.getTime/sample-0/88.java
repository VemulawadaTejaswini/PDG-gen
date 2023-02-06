//88
public class func{
public void massageDate(Date date,int hourOfDay,int minute,int second){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.SECOND, second);
        return cal.getTime();
}
}
