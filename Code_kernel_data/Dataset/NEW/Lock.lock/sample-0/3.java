//3
public class func{
public void getClusterInternal(){
        Lock readLock = clusterLock.readLock();
        readLock.lock();
            readLock.unlock();
}
}
