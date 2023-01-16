//135
public class func{
	public void getLastDayOfNextYear(){
        cal1.set(cal.get(Calendar.YEAR) + 1, cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 0, 0, 0);
        return cal1.getTime();
}
}
