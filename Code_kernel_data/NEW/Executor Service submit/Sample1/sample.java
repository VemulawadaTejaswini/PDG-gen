//0
public class func{
	public void shutdown_waitingOver_abruptShutdown(){
    final List<Integer> pool = new ArrayList<Integer>();
    backgroundExecutor.submit(new SleepingRunnable(1, 1000, pool));
    backgroundExecutor.submit(new SleepingRunnable(2, 1000, pool));
    backgroundExecutor.submit(new SleepingRunnable(3, 1000, pool));
    backgroundExecutor.submit(new SleepingRunnable(4, 1000, pool));
    backgroundExecutor.submit(new SleepingRunnable(5, 5000, pool));
    ExecutorServices.shutdown(backgroundExecutor, 100, TimeUnit.MILLISECONDS);
}
}
//1
public class func{
	public void testNewCachedThreadPoolWithThreadFactory(){
        executorService.submit(new NoopRunnable());
        executorService.submit(new NoopRunnable());
}
}
//2
public class func{
	public void testNewCachedThreadPool(){
        executorService.submit(new NoopRunnable());
        executorService.submit(new NoopRunnable());
}
}
//3
public class func{
	public void createKafkaMessageConsumer(ConsumerConnector consumerConn,String topic,String topicInHeader,CountDownLatch messagesLatch,Map<String,Integer> topicCountMap){
        for (final KafkaStream<byte[], byte[]> stream : consumerMap.get(topic)) {
            executor.submit(new KakfaTopicConsumer(stream, messagesLatch));
        }
        for (final KafkaStream<byte[], byte[]> stream : consumerMap.get(topicInHeader)) {
            executor.submit(new KakfaTopicConsumer(stream, messagesLatch));
        }
}
}
//4
public class func{
	public void if_two_threads_wait_concurrently_then_both_of_them_will_read_the_same_output(){
        Future<Boolean> t1 = executor.submit(new WaitForOutput("Runtime", process.subscribeToOutput()));
        Future<Boolean> t2 = executor.submit(new WaitForOutput("Runtime", process.subscribeToOutput()));
        process.start();
}
}
//5
public class func{
	public void testSubmitNullCallable(){
            e.submit((Callable) null);
}
}
//6
public class func{
	public void submit(ExecutorService execService,Callable<T> proc,int numTasks,String label){
            execService.submit(proc) ;
}
}
//7
public class func{
	public void testExecuteNullRunnable(){
            e.submit((Runnable) null);
}
}
