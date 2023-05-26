public class func{
public void processArrayValue(Object value,JsonConfig jsonConfig){
                       DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy HH:mm:ss 'GMT'Z", Functions.getClientLocale());
                       return dateFormat.format(value);
}
}
