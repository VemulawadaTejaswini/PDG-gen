//0
public class func{
public void getResources(){
        Lock readLock = resourcesLock.readLock();
        readLock.lock();
            readLock.unlock();
}
}
