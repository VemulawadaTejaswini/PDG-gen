//64
public class func{
	public void dateParams(){
        Calendar cal = Calendar.getInstance();
        cal.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        String str = getMessages().today(cal.getTime());
        assertEquals("{net.lightoze.gwt.i18n.client.TestMessages#today?t=" + cal.getTimeInMillis() + "}", str);
}
}
