public class func{
public void testDebugDates(){
    final Date date = (Date) getContext().resolveReference( ".C7" );
    System.out.println( df.format( date ) + ";" + date.getTime() );
    assertEquals( date, eval );
}
}
