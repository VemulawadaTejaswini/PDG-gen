//0
public class func{
	public void future(final Callable<T> task){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<T> future = executor.submit( task );
        executor.shutdown();
}
}
//1
public class func{
	public void runInParallel(ExecutorService exec,Collection<Runnable> runnables){
        for(Runnable runnable : runnables)
            exec.submit(runnable);
        exec.shutdown();
            exec.awaitTermination(1,TimeUnit.DAYS);
}
}
//2
public class func{
	public void testConcurrentGroups(){
            executorService.submit(new TestProducer());
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.MINUTES);
}
}
//3
public class func{
	public void run(){
                for (int i = 0; i < 100; i++) {
                    pool.submit(new TestRunnable(stripe, actual, i));
                }
                pool.shutdown();
}
}
//4
public class func{
	public void MultiTaskSource(List<TaskSource> sources){
            ExecutorService service = Executors.newFixedThreadPool(sources.size());
            for (TaskSource source : sources) {
                service.submit(new TaskRunner(source));
            }
            service.shutdown();
}
}
//5
public class func{
	public void AckProcessor(Map<String,PeerHandler> quorumMap,ClusterConfiguration cnf){
        Executors.newSingleThreadExecutor(DaemonThreadFactory.FACTORY);
    ft = es.submit(this);
    es.shutdown();
}
}
//6
public class func{
	public void internalNonBlockingStart(){
    ExecutorService executors = Executors.newFixedThreadPool( 1 );
    future = executors.submit( stackRunner );
    executors.shutdown();
}
}
//7
public class func{
	public void createAsciidoctor(){
        asciidoctor = es.submit(new Callable<Asciidoctor>() {
            @Override
            public Asciidoctor call() throws Exception {
                return Asciidoctor.Factory.create();
            }
        });
        es.shutdown();
}
}
//8
public class func{
	public void doConversion(){
    final Future<VideoFile> future = service.submit(new ConverterProcess(securityContext, inputVideo, outputFileName, outputSize));
    service.shutdown();
}
}
//9
public class func{
	public void descendants(final Optional<NodeReadTrx> pRtx){
      executor.submit(new GetDescendants());
      executor.shutdown();
}
}
//10
public class func{
	public void start(){
      return executor.submit( createCoordinator() );
      executor.shutdown();
}
}
//11
public class func{
	public void runAsyncInternal(){
        Crate.Tuple<ExecutorService, Boolean> crate = Concurrent.getManagedSingleThreadedExecutorService();
        jdkExecutor = !crate.getPayload2();
        ExecutorService executor = crate.getPayload1();
        executor.submit(callable);
        executor.shutdown();
}
}
//12
public class func{
	public void compressAsynchronously(String nameOfFile2Compress,String nameOfCompressedFile,String innerEntryName){
    Future<?> future = executor.submit(new CompressionRunnable(compressor,
        nameOfFile2Compress, nameOfCompressedFile, innerEntryName));
    executor.shutdown();
}
}
