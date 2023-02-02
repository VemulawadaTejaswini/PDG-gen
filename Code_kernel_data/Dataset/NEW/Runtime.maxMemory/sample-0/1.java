//1
public class func{
public void print(String msg){
        Runtime runtime = Runtime.getRuntime();
        System.out.println(String.format("### %s %.2fMB used, %.2fMB free, %.2fMB total, %.2fMB max",
                                         msg,
                                         1.0
                                                 * (runtime.totalMemory() - runtime.freeMemory())
                                                 / mb,
                                         1.0 * runtime.freeMemory() / mb,
                                         1.0 * runtime.totalMemory() / mb,
                                         1.0 * runtime.maxMemory() / mb));
}
}
