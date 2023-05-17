public class func{
public void print(Time time){
    p.setTimeZone(TimeZone.getTimeZone("UTC"));
    log("UTC Time is " + p.format(time));
}
}
