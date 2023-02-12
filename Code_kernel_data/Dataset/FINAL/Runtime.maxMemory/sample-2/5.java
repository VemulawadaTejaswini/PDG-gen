public class func{
public void almostOutOfMemory(Runtime runtime){
    return runtime.totalMemory() - runtime.freeMemory() > CANDIDATE_MEMORY_PERCENTAGE * runtime.maxMemory();
}
}
