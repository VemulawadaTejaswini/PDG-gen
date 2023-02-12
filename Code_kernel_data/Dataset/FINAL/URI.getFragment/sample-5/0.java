public class func{
public void copyAndConfigureFiles(JobConf job,Path submitJobDir,short replication){
        Path tmp = new Path(tmpURI);
        Path newPath = copyRemoteFiles(fs,filesDir, tmp, job, replication);
          URI pathURI = getPathURI(newPath, tmpURI.getFragment());
          DistributedCache.addCacheFile(pathURI, job);
          throw new IOException("Failed to create uri for " + tmpFile, ue);
}
}
