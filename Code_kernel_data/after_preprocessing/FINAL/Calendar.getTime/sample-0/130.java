public class func{
public void createBirthDate(int year,int month,int day){
        calendar.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
        calendar.set( year, month - 1, day, 12, 0, 0 );
        return calendar.getTime();
}
}
