//42
public class func{
public void getDate(Context context,Date date){
    DateFormat df = android.text.format.DateFormat.getDateFormat(context);
    return df.format(date);
}
}
