//18
public class func{
public void forceGC(int maxLoop){
        Runtime runtime = Runtime.getRuntime();
        long isFree = runtime.freeMemory();
        do {
            wasFree = isFree;
            runtime.gc();
            isFree = runtime.freeMemory();
            i++;
        } while (isFree > wasFree && (maxLoop<=0 || i<maxLoop) );
        runtime.runFinalization(); //TODO: should this be inside the loop?
}
}
