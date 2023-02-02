//7
public class func{
public void onOpenEvent(OpenEvent event){
    if (event.isNew()) eventCache.add(event);
    new Thread(new OpenEventNotifier(event)).start();
}
}
