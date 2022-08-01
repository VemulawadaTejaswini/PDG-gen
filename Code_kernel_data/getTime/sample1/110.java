//109
public class func{
	public void formatterShouldUseNewFormat(){
    assertThat(Formatter.formatDateTime(calendar.getTime()), is("1999-11-11"));
}
}
