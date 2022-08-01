//19
public class func{
	public void getWeek(){
        Calendar cal = Calendar.getInstance();
        Log.d(TAG, "week " + dateFormat.format(cal.getTime()));
        return dateFormat.format(cal.getTime());
}
}
