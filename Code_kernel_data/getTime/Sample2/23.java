//22
public class func{
	public void addDays(Date date,int n){
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.DATE, n);
    return cal.getTime();
}
}
