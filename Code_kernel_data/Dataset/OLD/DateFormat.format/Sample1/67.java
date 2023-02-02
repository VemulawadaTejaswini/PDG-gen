//66
public class func{
	public void asISO8601(Date date){
    DateFormat ISO8601 = getISO8601();
    String result = ISO8601.format(date);
    result = result.substring(0, result.length() - 2) + ":"
        + result.substring(result.length() - 2);
}
}
