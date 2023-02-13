public class func{
public void isTimedOut(final ImagingWorker worker){
    Calendar cal = Calendar.getInstance();
    cal.setTime(lastUpdated);
    cal.add(Calendar.MINUTE, WORKER_TIMEOUT_MIN);
    final Date expirationTime = cal.getTime();
}
}
