//8
public class func{
	public void addThread(){
        Thread t = new WorkerThread(workQueue);
        threads.add(t);
        t.start();            
}
}
