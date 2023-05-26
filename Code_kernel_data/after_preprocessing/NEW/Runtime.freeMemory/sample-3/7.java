//7
public class func{
public void getJvmInfo(){
    Runtime runtime = Runtime.getRuntime();
    jvm.add( "processors", runtime.availableProcessors() );
    long used = runtime.totalMemory() - runtime.freeMemory();
}
}
