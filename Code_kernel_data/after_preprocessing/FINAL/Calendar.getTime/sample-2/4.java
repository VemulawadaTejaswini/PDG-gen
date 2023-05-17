public class func{
public void timeToRemove(final ImagingWorker worker){
    Calendar cal = Calendar.getInstance();
    cal.setTime(lastUpdated);
    cal.add(Calendar.MINUTE, 60);
    final Date expirationTime = cal.getTime();
    return Math.abs((expirationTime.getTime() - new Date().getTime())/MINUTE);
}
}
