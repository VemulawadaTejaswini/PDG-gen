//107
public class func{
	public void runTest(final Class<?> c){
    Thread t = new Thread(new Runnable() {
      @Override public void run() {
        assertEquals(3000, c.getAnnotations().length);
      }
    }, c.toString());
    t.start();
}
}
