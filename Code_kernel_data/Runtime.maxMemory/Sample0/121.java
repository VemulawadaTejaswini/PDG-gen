//120
public class func{
	public void getMemoryInfo(){
      memoryInfo.append("Runtime free: ").append(kbString(run.freeMemory()))
            .append("\nRuntime max:").append(kbString(run.maxMemory()))
            .append("\nRuntime total:").append(kbString(run.totalMemory()));
}
}
