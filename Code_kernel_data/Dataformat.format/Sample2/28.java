//27
public class func{
	public void setDate(long dateTime){
      DateFormat df = new SimpleDateFormat(DATE_FORMAT);
      String dateStr= df.format(date);
      setDate(dateStr);
}
}
