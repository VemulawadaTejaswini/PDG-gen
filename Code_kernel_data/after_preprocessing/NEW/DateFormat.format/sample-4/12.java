//12
public class func{
public void toString(){
        DateFormat df = DateFormat.getDateTimeInstance();
        String msg = String.format("App launched #%d times since %s", launchCount, df.format(launhcFirstDate));
}
}
