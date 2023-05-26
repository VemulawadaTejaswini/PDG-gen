public class func{
public void init(PortletConfig portletConfig){
    Calendar calendar = new GregorianCalendar();
    String timestamp = dateFormat.format(calendar.getTime());
    logMessage.append(" INFO  [BridgeImpl] Initializing ");
}
}
