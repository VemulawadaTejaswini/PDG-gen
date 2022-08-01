//96
public class func{
	public void preprocess(Date value,Object... hints){
    final Calendar calendar = Calendar.getInstance();
    calendar.setTime(value);
    calendar.set(Calendar.MILLISECOND, 0);
    return calendar.getTime();
}
}
