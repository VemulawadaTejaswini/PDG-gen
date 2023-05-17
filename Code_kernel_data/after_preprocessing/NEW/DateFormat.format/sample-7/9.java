//9
public class func{
public void dateToString(Date date){
      DateFormat df = new SimpleDateFormat(dateFormat);
      df.setTimeZone(utc);
      return df.format(date);  
}
}
