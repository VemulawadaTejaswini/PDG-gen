public class func{
public void handleNotification(Notification n,Object h){
                        Thread t = new Thread(sensitiveThing);
                        t.start();
                            t.join();
}
}
