//198
public class func{
public void testGet(){
        FutureLockImpl<Boolean> future = new FutureLockImpl<Boolean>();
        new Thread(new NotifyFutureRunner(future, 2000, null)).start();
}
}
