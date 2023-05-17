//26
public class func{
public void collectOperatingSystemCounters(Map scalars){
            Runtime runtime= Runtime.getRuntime();
            addScalar(scalars, InternalDimensions.USED_JAVA_HEAP, runtime.totalMemory() - runtime.freeMemory());
}
}
