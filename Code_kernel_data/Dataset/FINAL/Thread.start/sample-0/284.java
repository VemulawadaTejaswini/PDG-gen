public class func{
public void onReceive(Context context,Intent intent){
    new Thread(new SignalFlareRunner(context,event)).start();
}
}
