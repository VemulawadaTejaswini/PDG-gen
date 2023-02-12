public class func{
public void setUnModifiedSince(String ifUnmodifiedSince){
        formatter = new SimpleDateFormat( "EEE, dd MMM yyyy HH:mm:ss z" );
        cal.setTime( formatter.parse( ifUnmodifiedSince )); 
            unmodifiedSince = cal.getTime();                
}
}
