public class func{
public void TimeToString(Date pDate){
    DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
    return formatter.format(pDate);
}
}
