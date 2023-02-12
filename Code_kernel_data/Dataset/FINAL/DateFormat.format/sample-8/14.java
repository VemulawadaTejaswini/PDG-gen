public class func{
public void getDebug(String message,Date value){
        return getDebug(message, (value == null) ? "null" : df.format(value));
}
}
