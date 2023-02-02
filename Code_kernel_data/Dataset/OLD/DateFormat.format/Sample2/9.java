//8
public class func{
	public void testDebugDates(){
    final DateFormat df = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSZ" );
    System.out.println( eval.getClass().getName() + ":" + df.format( eval ) + ";" + eval.getTime() );
}
}
