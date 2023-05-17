public class func{
public void getDateString(Date date){
    DateFormat dateFormat = new SimpleDateFormat(_PATTERN);
    return dateFormat.format(date);
}
}
