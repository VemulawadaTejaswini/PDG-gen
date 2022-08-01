//43
public class func{
	public void formatShortDate(final long date){
        final DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(context);
        return dateFormat.format(date);
}
}
