//95
public class func{
	public void runProcessing(String runWhere){
        new Thread(new ActionProcessing(runWhere)).start();
}
}
