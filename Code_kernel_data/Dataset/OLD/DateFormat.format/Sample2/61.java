//60
public class func{
	public void formatDate(Date date){
        final DateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.ENGLISH); // RFC 2822 format
        return format.format(date);
}
}
