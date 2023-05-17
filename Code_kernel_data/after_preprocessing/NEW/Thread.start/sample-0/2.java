//2
public class func{
public void isSpecificToTheCurrentThread(){
            Thread t = new Thread(new Runnable() {
                public void run() {
                    ThreadContext.setUp(myContext);
                }
            });
            t.start();
            t.join();
}
}
