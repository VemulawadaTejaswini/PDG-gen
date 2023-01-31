//7
public class func{
	public void getDateFromTimestamp(Context context,long timeInMiliseconds,TimeZone timeZone){
        Date date = new Date(timeInMiliseconds);
        return dateFormat.format(date) + ", " + timeFormat.format(date);
}
}
