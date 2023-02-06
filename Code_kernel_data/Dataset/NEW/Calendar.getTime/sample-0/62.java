//62
public class func{
public void dates(){
        Calendar cal = Calendar.getInstance();
        cal.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("Today is January 1, 1970", getMessages().today(cal.getTime()));
}
}
