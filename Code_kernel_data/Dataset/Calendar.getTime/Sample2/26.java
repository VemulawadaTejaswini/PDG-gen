//25
public class func{
	public void isTimedOut(final ImagingWorker worker){
    Calendar cal = Calendar.getInstance(); // creates calendar
    cal.setTime(lastUpdated); // sets calendar time/date
    cal.add(Calendar.MINUTE, WORKER_TIMEOUT_MIN); // adds 5 minutes
    final Date expirationTime = cal.getTime(); //
}
}
