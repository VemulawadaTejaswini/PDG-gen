//60
public class func{
	public void refresh(){
    Runtime rt = Runtime.getRuntime();
    this.vmStats.setInt(cpusId, rt.availableProcessors());
    this.vmStats.setLong(freeMemoryId, rt.freeMemory());
    this.vmStats.setLong(totalMemoryId, rt.totalMemory());
    this.vmStats.setLong(maxMemoryId, rt.maxMemory()); 
}
}
