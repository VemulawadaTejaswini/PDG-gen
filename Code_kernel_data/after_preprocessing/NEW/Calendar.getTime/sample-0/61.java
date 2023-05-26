//61
public class func{
public void datesWithProvidedLocale(){
        Calendar cal = Calendar.getInstance();
        cal.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("Today is 1. tammikuuta 1970", testMessages.today(cal.getTime()));
}
}
