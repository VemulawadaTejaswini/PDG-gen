//11
public class func{
	public void formatMessage(String message){
        String date = df.format(new Date());
        return String.format("%s %s", date, message);
}
}
