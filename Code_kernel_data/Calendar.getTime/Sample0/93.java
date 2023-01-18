//92
public class func{
	public void getDateRange(){
        Calendar then = Calendar.getInstance();
        then.setTime(now);
        then.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return new Date[]{then.getTime(), now};
}
}
