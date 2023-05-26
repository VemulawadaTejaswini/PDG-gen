public class func{
public void logInfo(){
    CountDownLatch latch = new CountDownLatch(1);
    new Thread(new MessageChecker(latch, messageListener)).start();
}
}
