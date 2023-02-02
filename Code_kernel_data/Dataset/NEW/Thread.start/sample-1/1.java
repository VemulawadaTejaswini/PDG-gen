//1
public class func{
public void AsyncInMemoryIndexingService(){
    Thread delete = new Thread(new DeleteThread());
    delete.setDaemon(true);
    delete.start();
}
}
