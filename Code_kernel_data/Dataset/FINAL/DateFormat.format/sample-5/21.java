public class func{
public void print(Timestamp time){
    p.setTimeZone(TimeZone.getTimeZone("UTC"));
    log("UTC Timestamp is " + p.format(time));
}
}
