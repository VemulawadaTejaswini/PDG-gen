//33
public class func{
	public void execute(Runnable command){
      Thread myThread = new Thread(command);
      myThread.start();
        myThread.join();
}
}
