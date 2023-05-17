public class func{
public void printMemoryUsage(){
    final Runtime runtime = Runtime.getRuntime();
    final long usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / megaUnit;
    final long totalMemory = runtime.totalMemory() / megaUnit;
    console.printf("-- Final Memory: %sM/%sM%n", usedMemory, totalMemory);
}
}
