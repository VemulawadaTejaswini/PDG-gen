//22
public class func{
public void formatTimeStamp(long timestamp){
            timeStarted.setTimeInMillis(timestamp);
            timeStampStr = dFormat.format(timeStarted.getTime()) + " "
                    + tFormat.format(timeStarted.getTime());
}
}
