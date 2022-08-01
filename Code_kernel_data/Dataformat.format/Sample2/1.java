//0
public class func{
	public void setEndTime(Date endTime){
        DateFormat endTimeFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
        return setConfig(END_TIME, endTimeFormat.format(endTime));
}
}
