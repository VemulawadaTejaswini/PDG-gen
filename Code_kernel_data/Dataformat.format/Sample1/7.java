//6
public class func{
	public void getFormattedDate(Context context,long date){
        Date dateO = new Date(date);
        String dateS = dateFormat.format(dateO) + " " + timeFormat.format(dateO);
        return TextUtil.trimString(dateS);
}
}
