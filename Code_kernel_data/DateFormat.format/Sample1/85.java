//84
public class func{
	public void getFormattedDate(DateFormat formatter){
        mCalendar.set(Calendar.YEAR, mAdapter.getYear());
        mCalendar.set(Calendar.MONTH, mAdapter.getMonth());
        mCalendar.set(Calendar.DAY_OF_MONTH, mAdapter.getDay());
        return formatter.format(mCalendar.getTime());
}
}
