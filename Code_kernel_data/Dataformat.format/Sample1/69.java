//68
public class func{
	public void formatToLocalTime(Context context,Date dateTime){
        java.text.DateFormat localTimeFormat = DateFormat.getTimeFormat(context);
        return localTimeFormat.format(dateTime);
}
}
