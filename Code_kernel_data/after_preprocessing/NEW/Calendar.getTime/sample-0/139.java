//139
public class func{
public void beforeGWTTest(){
      Calendar cal = new GregorianCalendar();
      cal.set(2010, 10, 24);
      sToday = DateTimeFormat.getFormat("EEE dd MMM").format(cal.getTime());
}
}
