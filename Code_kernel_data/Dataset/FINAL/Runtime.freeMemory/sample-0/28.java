public class func{
public void updateHeapValue(StringBuilder sb){
        final Runtime runtime = Runtime.getRuntime();
        final long heapMemory = runtime.totalMemory() - runtime.freeMemory();
        appendSize(sb, "Java heap size:          ", heapMemory, "\n");
}
}
