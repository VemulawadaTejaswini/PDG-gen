//30
public class func{
	public void toDate(int year,int month,int day,int hour,int minute,int second){
    Calendar calend = Calendar.getInstance();
    calend.set(Calendar.MILLISECOND, 0);
    return calend.getTime();
}
}
