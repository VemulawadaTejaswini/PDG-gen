//95
public class func{
	public void formatDate(Date date,String format){
    final DateFormat utcFormatter = createDateFormat(format);
    return utcFormatter.format(date);
}
}
