public class func{
public void returns_all_threads_in_a_thread_group(){
        Thread thread = new Thread(group, new LongRunningTask());
        thread.start();
        assertThat(Threads.getActiveThreads(group), containsInAnyOrder(thread));
        thread.interrupt();
}
}
