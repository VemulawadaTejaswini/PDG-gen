//18
public class func{
	public void aTimeInTheEvening(){
    Calendar time = Calendar.getInstance( TimeZone.getTimeZone( "Europe/Berlin" ) );
    time.set( Calendar.MILLISECOND, 311 );
    return time.getTime();
}
}
