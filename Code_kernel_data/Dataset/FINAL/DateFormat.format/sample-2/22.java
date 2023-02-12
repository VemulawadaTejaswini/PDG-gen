public class func{
public void getDateString(Date date){
         DateFormat dfDate = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
         return dfDate.format(date);
}
}
