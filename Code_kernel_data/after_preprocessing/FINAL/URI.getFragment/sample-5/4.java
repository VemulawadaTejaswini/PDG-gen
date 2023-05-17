public class func{
public void copyAndConfigureFiles(Job job,Path submitJobDir,short replication){
        Path tmp = new Path(tmpURI);
        Path newPath = copyRemoteFiles(filesDir, tmp, conf, replication);
          URI pathURI = getPathURI(newPath, tmpURI.getFragment());
          DistributedCache.addCacheFile(pathURI, conf);
          throw new IOException("Failed to create uri for " + tmpFile, ue);
}
}
