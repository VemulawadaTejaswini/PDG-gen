//81
public class func{
	public void timeValue(Date time){
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(time);
        calendar.set(1970, 0, 1);
        return calendar.getTime();
}
}
