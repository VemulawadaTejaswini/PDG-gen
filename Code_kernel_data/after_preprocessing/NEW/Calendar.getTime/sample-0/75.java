//75
public class func{
public void expectedDomainObject(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.MILLISECOND, 0);
    order.setOrderDate(calendar.getTime());
    order.setOrderId(ORDER_ID);
}
}
