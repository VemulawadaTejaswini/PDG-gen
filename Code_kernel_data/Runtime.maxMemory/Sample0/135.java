//134
public class func{
	public void setup(){
        final Runtime runtime = Runtime.getRuntime();
        System.err.printf("Total Memory : "+PrintPrecision+" MiB%n", runtime.totalMemory() / MIB);
        System.err.printf("Max Memory   : "+PrintPrecision+" MiB%n", runtime.maxMemory() / MIB);
}
}
