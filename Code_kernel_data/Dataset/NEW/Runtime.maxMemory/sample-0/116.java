//116
public class func{
public void dumpEnvironment(){
    buffer.append(String.format("OrientDB Memory profiler: Heap=%s of %s - DiskCache (%s dbs)=%s of %s - FS=%s of %s",
        OFileUtils.getSizeAsString(runtime.totalMemory() - runtime.freeMemory()), OFileUtils.getSizeAsString(runtime.maxMemory()),
        stgs, OFileUtils.getSizeAsString(diskCacheUsed), OFileUtils.getSizeAsString(diskCacheTotal),
        OFileUtils.getSizeAsString(freeSpaceInMB), OFileUtils.getSizeAsString(totalSpaceInMB)));
    return buffer.toString();
}
}
