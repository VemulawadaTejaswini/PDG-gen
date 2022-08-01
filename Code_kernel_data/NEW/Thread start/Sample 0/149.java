//148
public class func{
	public void runDomTests(){
    Thread testThread = new Thread(createDomTestRunnable());
    testThread.start();
}
}
