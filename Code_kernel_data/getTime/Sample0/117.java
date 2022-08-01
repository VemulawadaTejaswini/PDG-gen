//116
public class func{
	public void getDate(int year,int month,int day,int hour,int minute,int second,int millisecond){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
}
}
