//71
public class func{
	public void formatDate(String dateStr,String formatStr){
    java.text.DateFormat format2 = new java.text.SimpleDateFormat(formatStr);  
      java.util.Date date1 = (java.util.Date) format2.parseObject(dateStr);
      dateStr = format2.format(date1);  
}
}
