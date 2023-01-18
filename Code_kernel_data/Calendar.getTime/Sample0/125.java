//124
public class func{
	public void getStartingDate(){
        calendar.setTime(startingDate.getValue());
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE), 0, 0, 0);
        return calendar.getTime();
}
}
