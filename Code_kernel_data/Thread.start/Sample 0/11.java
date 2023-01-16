//10
public class func{
	public void awaitReadCloses(){
        final Pipe pipe = new Pipe(100);
        final Thread awaitThread = new Thread(new AwaitTask(pipe));
        awaitThread.start();
        awaitThread.join(200);
        assertTrue(awaitThread.isAlive());
        close(pipe.getIn());
}
}
