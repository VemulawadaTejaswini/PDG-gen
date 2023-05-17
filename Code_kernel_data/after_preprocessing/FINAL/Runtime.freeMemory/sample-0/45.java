public class func{
public void usedMemory(){
    Runtime runtime = Runtime.getRuntime();
    return "Used Memory: [" + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + " MB] ";
}
}
