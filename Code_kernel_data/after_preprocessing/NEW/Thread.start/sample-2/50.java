//50
public class func{
public void testSuccessfulTryLockTimeout(){
        final CyclicBarrier barrier=new CyclicBarrier(2);
        Thread locker=new Locker(barrier);
        locker.start();
}
}
