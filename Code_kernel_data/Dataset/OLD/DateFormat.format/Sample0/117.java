//116
public class func{
	public void getCurrentDateTimeString(String returnFormat){
    Date date = new Date();
    String dateString = dateFormat.format(date);
    dateString = dateString.replace(".", "");
}
}
