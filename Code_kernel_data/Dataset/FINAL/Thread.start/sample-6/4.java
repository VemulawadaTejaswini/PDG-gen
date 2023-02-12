public class func{
public void startThreads(List<Thread> threads,List<Thread> running){
        for (Thread t : threads)
        {
            t.start();
            running.add(t);
        }
        threads.clear();
}
}
