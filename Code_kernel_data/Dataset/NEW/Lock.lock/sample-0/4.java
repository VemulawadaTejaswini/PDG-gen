//4
public class func{
public void test3(){
        final Lock lock = new ReentrantLock();
        lock.lock();
            lock.unlock();
}
}
