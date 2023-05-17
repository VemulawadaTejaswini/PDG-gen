//7
public class func{
public void getStats(){
        Runtime runtime = Runtime.getRuntime();
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
            + runtime.freeMemory() / mb);
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
}
}
