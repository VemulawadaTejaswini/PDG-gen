public class func{
public void startAndJoinThreads(Vector<Thread> threads){
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
}
}
