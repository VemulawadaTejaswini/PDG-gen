//1
public class func{
	public void setStartTime(Date startTime){
        DateFormat startTimeForamt = new SimpleDateFormat(DATE_FORMAT_STRING);
        return setConfig(START_TIME, startTimeForamt.format(startTime));
}
}
