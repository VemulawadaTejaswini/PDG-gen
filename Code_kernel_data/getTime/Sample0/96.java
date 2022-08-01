//95
public class func{
	public void removeTime(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
