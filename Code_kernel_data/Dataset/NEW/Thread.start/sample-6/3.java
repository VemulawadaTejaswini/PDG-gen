//3
public class func{
public void startFetchRunner(){
        for (final Thread thread : this.fetchThreads) {
            thread.start();
        }
}
}
