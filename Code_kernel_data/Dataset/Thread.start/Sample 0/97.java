//96
public class func{
	public void can_update_blockingly(){
        Thread t = new Thread(() -> {
            SuiteMother.emptySuite(listener);
        });
        t.start();
}
}
