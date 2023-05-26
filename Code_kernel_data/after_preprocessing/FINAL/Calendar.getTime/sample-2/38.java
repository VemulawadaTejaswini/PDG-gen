public class func{
public void OutboundWapMessage(String recipientAddress,URL url,String siId,String text){
    cal.setTime(new Date());
    cal.add(Calendar.HOUR, 24);
    this.expiryDate = cal.getTime();
}
}
