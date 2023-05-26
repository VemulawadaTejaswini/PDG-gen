public class func{
public void testUtil(){
    DateFormat df = DateFormat.getDateTimeInstance( DateFormat.FULL, DateFormat.FULL, Locale.US );
    String strToday = df.format( today );
    Date date = ParameterHelper.parameterToDate( strToday, today );
    Assert.assertNotNull( date );
    BigDecimal dec = ParameterHelper.parameterToDecimal( "100.43", null );
    Assert.assertNotNull( dec );
    long longVal = ParameterHelper.parameterToLong( "1000000", 0 );
}
}
