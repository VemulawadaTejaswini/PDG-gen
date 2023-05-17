public class func{
public void totalFreeMemory(final Runtime runtime){
        return runtime.maxMemory() - runtime.totalMemory() + runtime.freeMemory();
}
}
