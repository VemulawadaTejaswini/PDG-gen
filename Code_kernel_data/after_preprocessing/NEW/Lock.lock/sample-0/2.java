//2
public class func{
public void getLoader(){
        Lock readLock = loaderLock.readLock();
        readLock.lock();
            readLock.unlock();
}
}
