//76
public class func{
	public void testDateAndTimeExpressions(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 123);
        exchange.getIn().setHeader("birthday", cal.getTime());
}
}
