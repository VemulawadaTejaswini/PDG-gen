//148
public class func{
	public void createDate1(){
    final Calendar cal = GregorianCalendar.getInstance();
    cal.set( GregorianCalendar.SECOND, 0 );
    return cal.getTime();
}
}
