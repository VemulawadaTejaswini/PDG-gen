//4
public class func{
	public void doSystemExit(){
        LOG.debug("doSystemExit called");
        if (LOG.isDebugEnabled()) {
            dumpThreads();
            
            Runtime r = Runtime.getRuntime();
            LOG.debug("memory usage (free/used/total/max allowed): {}/{}/{}/{}", r.freeMemory(), (r.totalMemory() - r.freeMemory()), r.totalMemory(), (r.maxMemory() == Long.MAX_VALUE ? "infinite" : r.maxMemory()));
        }
        LOG.info("calling System.exit(0)");
}
}
