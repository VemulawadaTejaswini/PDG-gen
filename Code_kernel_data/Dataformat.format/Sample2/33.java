//32
public class func{
	public void getXpathFormattedTime(Date date){
    DateFormat xpathTimeFormatter = new SimpleDateFormat("HH:mm:ss.SSS");
    return xpathTimeFormatter.format(date);
}
}
