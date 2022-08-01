//6
public class func{
	public void getStartDate(String dateFormat){
    DateFormat df = new SimpleDateFormat(dateFormat,Locale.getDefault());
    String date = df.format(start);
}
}
