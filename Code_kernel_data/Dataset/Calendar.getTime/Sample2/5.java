//4
public class func{
	public void timeToRemove(final ImagingWorker worker){
    Calendar cal = Calendar.getInstance(); // creates calendar
    cal.setTime(lastUpdated); // sets calendar time/date
    cal.add(Calendar.MINUTE, 60); // remove records after 1 hour
    final Date expirationTime = cal.getTime();
    return Math.abs((expirationTime.getTime() - new Date().getTime())/MINUTE);
}
}
