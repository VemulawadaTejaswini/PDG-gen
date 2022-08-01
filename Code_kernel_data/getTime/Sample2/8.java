//7
public class func{
	public void daysPass(int days){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.DAY_OF_YEAR, days);
    date = calendar.getTime();
}
}
