//23
public class func{
	public void getDefault(){
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DATE,31);
    return DateUtil.endOfDay(cal.getTime());
}
}
