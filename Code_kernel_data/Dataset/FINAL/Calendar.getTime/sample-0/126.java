public class func{
public void PricingFieldTest(String name){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.clear();
        calendar.set(2009, 11, 16);
        DATE_VALUE = calendar.getTime();
        DATE_VALUE_STRING = String.valueOf(DATE_VALUE.getTime());        
}
}
