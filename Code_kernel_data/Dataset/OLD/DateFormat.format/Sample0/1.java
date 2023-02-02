//0
public class func{
	public void getDateTime(Long d){
        if (d != null)
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = (d == null) ? new Date() : new Date(d);
        return dateFormat.format(date);
}
}
