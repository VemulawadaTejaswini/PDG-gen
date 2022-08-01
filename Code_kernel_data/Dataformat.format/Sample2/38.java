//37
public class func{
	public void setMessageCode(String messageId){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        MDC.put("LOG_TSTAMP", dateFormat.format(logTime));
        MDC.put("MESSAGE_ID", messageId);
}
}
