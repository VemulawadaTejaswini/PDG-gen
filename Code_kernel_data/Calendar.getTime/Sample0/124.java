//123
public class func{
	public void getEndingDate(){
        calendar.setTime(endingDate.getValue());
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE), 23, 59, 59);
        return calendar.getTime();
}
}
