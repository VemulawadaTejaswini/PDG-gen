public class func{
public void appendSystemInfo(){
        append("Free Memory: " + runtime.freeMemory() / 1024 / 1024 + "MB");
        append("Max Memory: " + runtime.maxMemory() / 1024 / 1024 + "MB");
        append("Total Memory: " + runtime.totalMemory() / 1024 / 1024 + "MB");
}
}
