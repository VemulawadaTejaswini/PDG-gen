public class func{
public void execute(String description,List<Thread> threads){
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
}
}
