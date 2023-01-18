//35
public class func{
	public void startNewAcceptor(){
        Thread t = AccessController.doPrivileged(
            new NewThreadAction(ConnectionAcceptor.this,
                                "Multiplex Accept-" + ++ threadNum,
                                true));
        t.start();
}
}
