//128
public class func{
	public void date(int year,int month,int day){
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(year, month - 1, day);
        return cal.getTime();
}
}
