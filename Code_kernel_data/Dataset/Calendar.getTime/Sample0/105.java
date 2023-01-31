//104
public class func{
	public void makeDate(int year,int month,int day){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month-1, day);
        return cal.getTime();
}
}
