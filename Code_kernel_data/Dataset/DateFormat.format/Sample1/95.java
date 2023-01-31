//94
public class func{
	public void longToDateStr(long date){
        final DateFormat dateFormat = CACHE.get();
        return dateFormat.format(date);
}
}
