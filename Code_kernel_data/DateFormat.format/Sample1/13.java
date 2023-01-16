//12
public class func{
	public void dateConverterShouldAcceptStringAndNumeric(){
    String strDate = df.format(new Date(now));
    Date date2 = genson.deserialize(String.format("\"%s\"", strDate), Date.class);
    assertEquals(strDate, df.format(date2));
}
}
