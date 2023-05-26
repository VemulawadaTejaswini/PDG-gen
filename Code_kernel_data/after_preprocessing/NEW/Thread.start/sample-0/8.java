//8
public class func{
public void onStartCommand(Intent intent,int flags,int requestId){
        if (isSelfStartCommand(intent)) {
            mStarted = requestId;
        } else {
            new Thread(new RemoteControlButtonTask(intent, this, requestId))
                    .start();
        }
}
}
