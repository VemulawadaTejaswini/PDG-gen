//41
public class func{
	public void AsyncInMemoryIndexingService(){
    Thread audit = new Thread(new AuditThread());
    audit.setDaemon(true);
    audit.start();
}
}
