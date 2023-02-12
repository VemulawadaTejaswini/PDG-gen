public class func{
public void basicTestParallelSums(Object[] array,Sum parallelSum1,Sum parallelSum2){
        Thread thread2 = new Thread(() -> this.parallelSum(array, parallelSum2));
        thread2.start();
}
}
