//5
public class func{
	public void populateStats(Statistics stats){
    Runtime rt = Runtime.getRuntime();
    long used = rt.totalMemory() - rt.freeMemory();
    stats.addBytes("Max memory", rt.maxMemory());
    stats.addBytes("Used memory", used, critical);
    stats.addBytes("Free memory", rt.freeMemory());
    stats.addBytes("Total memory", rt.totalMemory());
    stats.add("Number of processors", rt.availableProcessors());
}
}
