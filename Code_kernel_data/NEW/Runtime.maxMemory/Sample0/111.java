//110
public class func{
	public void dumpEnvironment(){
        buffer.append(String.format(
            "OrientDB Memory profiler: HEAP=%s of %s - DISKCACHE (%s dbs)=%s of %s - OS=%s of %s - FS=%s of %s",
            OFileUtils.getSizeAsString(runtime.totalMemory() - runtime.freeMemory()),
            OFileUtils.getSizeAsString(runtime.maxMemory()), stgs, OFileUtils.getSizeAsString(diskCacheUsed),
            OFileUtils.getSizeAsString(diskCacheTotal), OFileUtils.getSizeAsString(osUsedMem),
            OFileUtils.getSizeAsString(osTotalMem), OFileUtils.getSizeAsString(freeSpaceInMB),
            OFileUtils.getSizeAsString(totalSpaceInMB)));
        return buffer.toString();
}
}
