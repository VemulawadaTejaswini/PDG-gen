public class func{
public void returns_all_threads_in_child_thread_groups(){
        Thread threadInChild = new Thread(child, new LongRunningTask());
        threadInChild.start();
        assertThat(Threads.getActiveThreads(parent), containsInAnyOrder(threadInChild));
        threadInChild.interrupt();
}
}
