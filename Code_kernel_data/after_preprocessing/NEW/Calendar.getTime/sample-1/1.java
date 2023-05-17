//1
public class func{
public void addElapsedTime(int seconds){
        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
        LOGGER.info("Current time: " + calendar.getTime());
        calendar.add(Calendar.SECOND, seconds);
        LOGGER.info("Updated time (+" + seconds + "): " + calendar.getTime());
        long currentTimeSeconds = calendar.getTimeInMillis() / 1000;
}
}
