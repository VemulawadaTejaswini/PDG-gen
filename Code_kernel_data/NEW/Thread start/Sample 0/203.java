//202
public class func{
	public void stop(StopContext context){
            context.asynchronous();
            new Thread(() -> {
                super.cleanup();
                executor = null;
                context.complete();
            }).start();
}
}
