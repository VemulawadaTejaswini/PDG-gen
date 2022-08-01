//31
public class func{
	public void formatAsHashInDateFormat(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DATE, 16);
    shouldCompileTo("{{dateFormat date format=\"dd-MM-yyyy\"}}", $("date", calendar.getTime()),
        "16-07-1999");
}
}
