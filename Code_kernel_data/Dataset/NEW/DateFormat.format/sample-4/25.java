//25
public class func{
public void print(Timestamp time){
    DateFormat p = DateFormat.getDateTimeInstance(DateFormat.FULL,
        DateFormat.FULL);
    log("Local Timestamp is " + p.format(time));
}
}
