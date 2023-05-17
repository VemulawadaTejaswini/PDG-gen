//38
public class func{
public void getFormattedDate(Date date){
    DateFormat instance = new SimpleDateFormat("ddMMyyyyHHmmss");
    return instance.format(date);
}
}
