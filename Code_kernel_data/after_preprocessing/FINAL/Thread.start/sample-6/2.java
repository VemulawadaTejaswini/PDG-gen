public class func{
public void run(){
        for (final Thread thread : this.threads) {
            thread.start();
        }
        Thread.yield();
}
}
