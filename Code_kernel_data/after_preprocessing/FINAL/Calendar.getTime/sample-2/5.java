public class func{
public void addDays(java.util.Date value,final int days){
        final Calendar cal = Calendar.getInstance();
        cal.setTime(value);
        cal.add(Calendar.DATE, days);
        final Date adjusted = cal.getTime();
}
}
