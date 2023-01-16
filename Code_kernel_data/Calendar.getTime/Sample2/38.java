//37
public class func{
	public void getExpirationDate(){
        final Date changeDate = Version.getChangeDate();
        if ( changeDate != null ) {
            cal.setTime( changeDate );
            cal.add( Calendar.DATE, DaysBeforeExpiration );
            return cal.getTime();
        }
}
}
