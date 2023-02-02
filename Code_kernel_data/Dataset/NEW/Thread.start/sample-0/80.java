//80
public class func{
public void awaitTermination(){
        final TerminationAwait terminationAwait = new TerminationAwait(serviceContainer);
        final Thread thread = new Thread(terminationAwait);
        thread.start();
        assertTrue(thread.isAlive());
        shutdownContainer();
}
}
