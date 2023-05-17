public class func{
public void basicTestParallelSums(Object[] array,Sum parallelSum1,Sum parallelSum2){
        Thread thread1 = new Thread(() -> this.parallelSum(array, parallelSum1));
        thread1.start();
}
}
