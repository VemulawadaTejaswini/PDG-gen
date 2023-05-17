//15
public class func{
public void printMem(String head){
    Runtime runtime = Runtime.getRuntime();
        + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        + runtime.freeMemory() / mb);
}
}
