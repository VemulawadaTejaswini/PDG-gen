//57
public class func{
	public void createDate(int year,int month,int day,int hour,int minute){
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("JST"), Locale.JAPANESE);
        calendar.clear();
        calendar.set(Calendar.MINUTE, minute);
        return new DateTime(calendar.getTime().getTime());
}
}
