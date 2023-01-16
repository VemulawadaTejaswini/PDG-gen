//0
public class func{
	public void create(final boolean catchFinalizer){
            Thread t = new Thread(new Runnable() {
                public void run() {
                    new Foo(catchFinalizer);
                }});
            t.start();
            t.join();
}
}
