//22
public class func{
	public void updateTitle(int year,int month,int day){
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
                year == NO_YEAR ? mTitleNoYearDateFormat : mTitleDateFormat;
        setTitle(dateFormat.format(calendar.getTime()));
}
}
