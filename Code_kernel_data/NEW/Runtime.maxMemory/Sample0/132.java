//131
public class func{
	public void getJvmInfo(){
    mem.add("free", humanReadableUnits(runtime.freeMemory(), df));
    mem.add("total", humanReadableUnits(runtime.totalMemory(), df));
    mem.add("max", humanReadableUnits(runtime.maxMemory(), df));
    mem.add("used", humanReadableUnits(used, df) + " (%" + df.format(percentUsed) + ")");
    jvm.add("memory", mem);
    SimpleOrderedMap<Object> jmx = new SimpleOrderedMap<Object>();
}
}
