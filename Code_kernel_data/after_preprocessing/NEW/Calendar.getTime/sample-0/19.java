//19
public class func{
public void christmasDay(){
    Calendar christmas = Calendar.getInstance( TimeZone.getTimeZone( "Europe/Berlin" ) );
    christmas.set( Calendar.MILLISECOND, 0 );
    return christmas.getTime();
}
}
