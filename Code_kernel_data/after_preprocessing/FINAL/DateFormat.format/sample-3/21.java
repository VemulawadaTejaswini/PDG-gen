public class func{
public void debug(final String message,final Calendar value){
        debug(message, (value == null) ? "null" : df.format(value.getTime()));
}
}
