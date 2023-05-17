public class func{
public void testXCommandLifecycleNotLocking(){
        Thread t = new LockGetter();
        t.start();
}
}
