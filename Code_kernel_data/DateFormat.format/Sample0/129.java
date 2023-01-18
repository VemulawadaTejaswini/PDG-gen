//128
public class func{
	public void formatDateTime(long datetime){
        Date date = new Date(datetime*1000L);
        return dateFormat.format(date);
}
}
