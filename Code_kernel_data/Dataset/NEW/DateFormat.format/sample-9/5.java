//5
public class func{
public void formatToSqlDate(final Date date){
        df.setTimeZone(getTimeZoneOfTenant());
        final String formattedSqlDate = df.format(date);
}
}
