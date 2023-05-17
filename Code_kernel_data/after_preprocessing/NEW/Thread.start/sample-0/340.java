//340
public class func{
public void test_parkFor_3(){
        CyclicBarrier barrier = new CyclicBarrier(1);
        Parker parker = new Parker(barrier, false, 1000);
        Thread parkerThread = new Thread(parker);
        UNSAFE.unpark(parkerThread);
        parkerThread.start();
}
}
