public class func{
public void shouldPurge(final ImagingTask task){
    Calendar cal = Calendar.getInstance();
    cal.setTime(lastUpdated);
    cal.add(Calendar.HOUR_OF_DAY, TASK_PURGE_EXPIRATION_HOURS);
    final Date expirationTime = cal.getTime();
}
}
