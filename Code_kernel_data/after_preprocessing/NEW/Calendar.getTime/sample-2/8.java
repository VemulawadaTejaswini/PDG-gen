//8
public class func{
public void addDay(String aDate,int days){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return format.format(cal.getTime());
}
}
