//100
public class func{
	public void date(int year,int month,int day){
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.DAY_OF_MONTH, day);
    return calendar.getTime();
}
}
