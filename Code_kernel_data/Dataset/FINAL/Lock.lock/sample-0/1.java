public class func{
public void getManager(){
        Lock readLock = managerLock.readLock();
        readLock.lock();
            readLock.unlock();
}
}
