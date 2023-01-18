//63
public class func{
	public void appendHash(String name,Date timestamp){
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        return new StringBuilder(name).append(DELIMITER).append(df.format(timestamp)).toString();
}
}
