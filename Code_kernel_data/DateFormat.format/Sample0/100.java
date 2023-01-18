//99
public class func{
	public void getLogFileSuffix(){
      String timestamp = dateFormat.format(new Date());
      logFileSuffix = logFileSuffix.replace("#timestamp", timestamp);
}
}
