public class func{
public void formatDateString(Context context,long time){
        Date date = new Date(time);
        return dateFormat.format(date) + " " + timeFormat.format(date);
}
}
